package com.employee_crud.dao;
import com.Employeespringbootapp.Employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee_crud.repository.EmployeeRepo;

public class EmployeeDao {
	
	@Autowired
	EmployeeRepo repo;
	
	public Employee saveEmployee(Employee e) {
		return repo.save(e);
	}
	
	public List<Employee> getEmployee(){
		return repo.findAll();
	}
	
	public String updateEmployee(int id) {
		Optional<Employee> optional=repo.findById(id);
		if(optional.isPresent()){
			Employee e=optional.get();
			repo.save(e);
			return e.getId()+" is Successfully Updated";
		}
		else {
			return null;
		}
	}
	
	public String deleteEmployee(int id) {
		Optional<Employee> optional1 = repo.findById(id);
		if(optional1.isEmpty()) {
			return null;
		}
		else {
			Employee e1=optional1.get();
			repo.delete(e1);
			return e1.getName()+" Successfully Deleted";
		}
	}
	
	public Employee getEmployeeById(int id) {
		Optional<Employee> optional3= repo.findById(id);
		if(optional3.isPresent()) {
			return optional3.get();
		}
		else {
			return null;
		}
	}
	
	public Employee getEmployeeByName(String name) {
		
		Optional<Employee> optional=repo.getPersonByName(name);
		if(optional.isPresent()) {
			return optional.get();
		}
		else {
			return null;
		}
		
	}

}
