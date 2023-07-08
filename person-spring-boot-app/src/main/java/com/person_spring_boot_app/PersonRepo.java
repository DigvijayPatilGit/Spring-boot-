package com.person_spring_boot_app;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Integer>{
                                                //entity class name , pk datatype in Object=Integer, primitive datatype=int
	Person getPersonByName(String name); //Manual Method, "getPersonByName=name" take variable in method name from which data we want at last but first letter capital
	List<Person> getPersonByAge(int age); //getPersonByAge=age                                     
}
