package com.example.employee.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.employee.dto.Employee;

@Controller
@RequestMapping("/employees")
public class EmpController {
	
	private List<Employee> list;

	@PostConstruct
	public void loadData() {
		
		Employee e1=new Employee(1, "Rahul", "rahul123@mail", 98986565);
		Employee e2=new Employee(2, "Kontil", "konyil987@mail", 78451254);
		Employee e3=new Employee(3, "Mohan", "mohan25@mail", 87542178);
		Employee e4=new Employee(4, "Janak", "janak258@mail", 32659845);
		Employee e5=new Employee(5, "Pinak", "pinal000@mail", 25413698);
		
		list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

	}
	
	@GetMapping("/list")
	public String listemployee(Model model) {
		
		model.addAttribute("employees", list);
		return "list-employees";
	}

}
