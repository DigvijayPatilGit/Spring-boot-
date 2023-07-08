package com.employee_crud.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.Employeespringbootapp.Employee;
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
	Optional<Employee> getPersonByName(String name);

}
