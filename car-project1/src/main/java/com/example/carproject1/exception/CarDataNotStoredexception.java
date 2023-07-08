package com.example.carproject1.exception;

public class CarDataNotStoredexception extends RuntimeException{
	
	String msg = "Unable To store the Data";
	
	public CarDataNotStoredexception() {
		
	}
	public CarDataNotStoredexception(String msg) {
		this.msg=msg;
	}
	public String getMessage() {
		return msg;
	}

}
