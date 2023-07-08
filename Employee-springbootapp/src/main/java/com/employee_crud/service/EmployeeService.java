package com.employee_crud.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee_crud.dao.EmployeeDao;
import com.Employeespringbootapp.Employee;
@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao dao;
	
	public Employee saveEmployee(Employee e) {
		return dao.saveEmployee(e);
	}
	
	public List<Employee> getEmployee(){
		List<Employee> list=dao.getEmployee();
		return list;
	}
	
	public String updateEmployee(int id) {
		return dao.updateEmployee(id);
	}
	
	public String deleteEmployee(int id) {
		return dao.deleteEmployee(id);
	}
	
	public Employee getEmployeeebyId(int id) {
		return dao.getEmployeeById(id);
	}
	
	public Employee getEmployeeByName(String name) {
		return dao.getEmployeeByName(name);
	}

}
