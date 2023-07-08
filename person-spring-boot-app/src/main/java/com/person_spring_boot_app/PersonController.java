package com.person_spring_boot_app;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@Autowired
	PersonRepo pr;
	
	//Saving the Data
	@PostMapping("/info2")
	public String savePerson(@RequestBody Person p) {
		pr.save(p);
		return "Person saved Successfully";
	}
	
	//Retrieve or getting the data
	@GetMapping("/getPerson")
	public List<Person> getPersons(){
		List<Person> list=pr.findAll();
		return list;
		
	}
	
	//Retrieve or getting the data by id
	//Using @Pathvariable and @RequestParam annotation as a Query Parameters
	//Type 1
	@GetMapping("/getById/{id}") //We have to pass is in url endpoint which data we want in postmaping appn.
	public Person getPersonById(@PathVariable int id) {
		Optional<Person> o = pr.findById(id);
		
		if(o.isPresent()) {
			return o.get();
		}
		return null;
	}
	
	//Type 2
	@GetMapping("/without/{anyWord}")
	public Person getPersonById2(@PathVariable(value = "anyWord") int id) {
		Optional<Person> o= pr.findById(id);
		if(o.isPresent()) {
			return o.get();
		}
		return null;
	}
	
	@GetMapping("/requstParam")  //in postman url give ...8080/requestParam?1 <- ?id u want 
	public Person getPersonByIdRequestParam(@RequestParam int id) {
		Optional<Person> o = pr.findById(id);
		
		if(o.isPresent()) {
			return o.get();
		}
		return null;
	}
	
	
	//Updating the data @PutMapping
	@PutMapping("/update")
	public Person updatePerson (@RequestBody Person p) {
		return pr.save(p);
	}
	
	//Deleting the Particular data @DeleteMapping
	@DeleteMapping("/delete/{id}")
	public String deletePerson(@PathVariable int id) {
		Optional<Person> o = pr.findById(id);
		
		if(o.isEmpty()) {
			return null;
		}
		else {
			Person p=o.get();
			pr.delete(p);
			return p.getName()+" is Deleted Successfully";
		}
	}
	
	//Type 2
	@DeleteMapping("/deletetwo/{anything}")
	public String deletePersonTwo(@PathVariable(value = "anything") int id) {
		Optional<Person> o = pr.findById(id);
		
		if(o.isEmpty()) {
			return null;
		}
		else {
			Person p=o.get();
			pr.delete(p);
			return p.getName()+" is Deleted Successfully";
		}
	}
	
	
	//Getting or deleting data By Creating Methods Manually Inside Interface (PersonRepo)
	
	@GetMapping("/getByName/{name}") //in postman url give ...8080/getByName/Lucky <-name which data you want
	public Person getPersonByName(@PathVariable String name) {
		return pr.getPersonByName(name);
	
	}
	
	@GetMapping("/getByAge/{age}")
	public List<Person> getPersonByAge(@PathVariable int age){
		List<Person> list = pr.getPersonByAge(age);
		if(list!=null) {
			return list;
		}
		return null;
	}
	
}
