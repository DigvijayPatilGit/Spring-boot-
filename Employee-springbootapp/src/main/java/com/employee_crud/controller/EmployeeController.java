package com.employee_crud.controller;
import com.Employeespringbootapp.Employee;
import java.util.List;
import com.Employeespringbootapp.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee_crud.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping
	public Employee saveEmployee(@RequestBody Employee e) {
		e.setName("rajesh");
		e.setJob("Java Devloper");
		e.setAge(29);
		return service.saveEmployee(e);
	}
	
	@GetMapping("/get")
	public List<Employee> getEmployees(){
		List<Employee> list=service.getEmployee();
		return list;
	}
	
	@PutMapping("/update/{id}")
	public String updateEmployee(@PathVariable(value = "id")int  id) {
		return service.updateEmployee(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable(value = "id")int id) {
		return service.deleteEmployee(id);
	}
	
	@GetMapping("/byid/{id}")
	public Employee getEmployeeById(@PathVariable(value = "id") int id) {
		return service.getEmployeeebyId(id);
	}
	
	@GetMapping("/byname/{name}")
	public Employee getEmployeeByName(@PathVariable(value = "name")String Name) {
		return service.getEmployeeByName(Name);
	}

}
