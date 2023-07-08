package com.example.carproject1.exception;

public class NoIdAvailableException extends RuntimeException{
	
	String msg="Id Not Present In dataBase";
	
	public NoIdAvailableException(){
		
	}

	public NoIdAvailableException(String msg) {
		super();
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg;
	}

}
