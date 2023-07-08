package com.springbootapp2postmaping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstApi {
	
	@PostMapping("/info")  //this annotation not works on web browser only work on postman application so we have to enter url in postman app
	public static Student m(Student s) {
		s.setName("Rocky");
		s.setAge(19);
		s.setMarks(95);
		return s;
		
	}
	
	
	@PostMapping("/detail")
	public List<Student> datails(){
		List<Student> list=new ArrayList<>();
		Student s1=new Student();
		s1.setName("Mahesh");
		s1.setAge(24);
		s1.setMarks(89);
		
		Student s2=new Student();
		s2.setName("Rakhi");
		s2.setAge(22);
		s2.setMarks(83);
		
		Student s3=new Student();
		s3.setName("Tanisha");
		s3.setAge(21);
		s3.setMarks(45);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		return list;
		
		
		
	}

}
