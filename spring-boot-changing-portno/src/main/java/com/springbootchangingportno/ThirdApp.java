package com.springbootchangingportno;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThirdApp {
		
	    @PostMapping("/yep")
		public static List<Employee> info(){
			Employee e1=new Employee();
			e1.setName("Raju");
			e1.setJob("electrician");
			e1.setSal(20000.23);
			
			Employee e2=new Employee();
			e2.setName("Lakhan");
			e2.setJob("Welder");
			e2.setSal(21000.34);
			
			Employee e3=new Employee();
			e3.setName("Bablu");
			e3.setJob("electrician");
			e3.setSal(20000.23);
			
			List<Employee> list=new ArrayList<>();
			list.add(e1);
			list.add(e2);
			list.add(e3);
			return list;
			
		}


}
