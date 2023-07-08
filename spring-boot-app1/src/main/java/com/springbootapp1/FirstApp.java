package com.springbootapp1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Controller required to give output
public class FirstApp {
	
	@GetMapping("/meth")  //giving url name to search on browser
	public static String m() {
		return "Welcome to Spring-Boot";
	}
	
	@GetMapping("/time")
	public static LocalTime m2() {   //giving exact time
		return LocalTime.now();
	}
	
	@GetMapping("/datetime")
	public static LocalDateTime m3() {   //giving exact time and date
		return LocalDateTime.now();
	}
	
	@GetMapping("/date")
	public static LocalDate m4() {
		return LocalDate.now();
	}
	
	@PostMapping("/info")
	public static Student details(Student s) {
		s.setName("Mukesh");
		s.setAge(45);
		s.setMarks(48);
		return s;
		
	}

}
