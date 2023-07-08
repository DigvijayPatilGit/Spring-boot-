package com.example.carproject1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.carproject1.dto.Car;
import com.example.carproject1.dto.ResposeStructure;

@ControllerAdvice
public class Handler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(NoIdAvailableException.class)
	public ResponseEntity<ResposeStructure<String>> noIdAvailableException(NoIdAvailableException eid1){
		ResposeStructure<String> structure=new ResposeStructure<String>();
		structure.setCode(HttpStatus.NOT_FOUND.value()); //Give status code like 404, 401 which represent by not found message
		structure.setMessage(eid1.getMessage());
		return new ResponseEntity<ResposeStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(DataNotAvailableException.class)
	public ResponseEntity<ResposeStructure<String>> dataNotAvailableException(DataNotAvailableException exc){
		ResposeStructure<String> structure=new ResposeStructure<String>();
		structure.setCode(HttpStatus.NOT_FOUND.value());
		structure.setMessage(exc.getMessage());
		return new ResponseEntity<ResposeStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(CarDataNotStoredexception.class)
	public ResponseEntity<ResposeStructure<String>> cardataNotStoredException(CarDataNotStoredexception exc2){
		ResposeStructure<String> structure=new ResposeStructure<String>();
		structure.setCode(HttpStatus.NOT_FOUND.value());
		structure.setMessage(exc2.getMessage());
		return new ResponseEntity<ResposeStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}

}
