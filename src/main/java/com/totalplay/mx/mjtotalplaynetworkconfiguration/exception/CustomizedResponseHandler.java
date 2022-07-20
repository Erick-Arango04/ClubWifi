package com.totalplay.mx.mjtotalplaynetworkconfiguration.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomizedResponseHandler extends ResponseEntityExceptionHandler {
	
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) throws Exception {
		
		ExceptionResponseFull  exceptionResponse = new ExceptionResponseFull("1","" + (int)(Math.random()*99999999+1),"No fue posible consultar la información");
		/*
		System.out.print(ex.getMessage());
		System.out.print(request.getDescription(false));
		*/	  
			  return new ResponseEntity(exceptionResponse,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		ExceptionResponseFull  exceptionResponse = new ExceptionResponseFull("1","" + (int)(Math.random()*99999999+1), "información Incorrecta");

	//	handleExceptionInternal(ex, null, headers, status, request);
		
		return new ResponseEntity(exceptionResponse,HttpStatus.BAD_REQUEST);
	}

}
