package com.sopra.microservices.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MobileException {
	
	String msg;
	
	Throwable Cause;
	
	HttpStatus code;

}
