package com.totalplay.mx.mjtotalplaynetworkconfiguration.exception;

public class ExceptionResponseFull {
	
	private ExceptionResponse results;
	
	
	ExceptionResponseFull(String result, String resultIdentifier, String resultRescription){
		
		results = new ExceptionResponse(result, resultIdentifier, resultRescription);
	}

	
	public ExceptionResponse getResults() {
		
		return results;
	}
}
