package com.example.carproject1.exception;

public class DataNotAvailableException extends RuntimeException{
	
	String msg;
	
	public DataNotAvailableException() {
		
	}
	
	public DataNotAvailableException(String msg) {
		this.msg=msg;
	}
	
	public String getMessage() {
		return msg;
	}

}
