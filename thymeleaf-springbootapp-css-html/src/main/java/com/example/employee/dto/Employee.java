package com.example.employee.dto;

import javax.persistence.Entity;

@Entity
public class Employee {
	
	private int id;
	private String name;
	private String mail;
	private long mobNo;
	
	public Employee(){
		
	}

	public Employee(int id, String name, String mail, long mobNo) {
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.mobNo = mobNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	
	
	
	

}
