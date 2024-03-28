package com.sopra.microservices.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MobileExceptionHandler {
	
	@ExceptionHandler(value= {MobileNotFoundException.class})
	public ResponseEntity<Object> exceptionFun(MobileNotFoundException e){
		MobileException me=new MobileException(e.getMessage(),e.getCause(),HttpStatus.NOT_FOUND);
		return new ResponseEntity<Object>(me, HttpStatus.NOT_FOUND);
		
	}

}
