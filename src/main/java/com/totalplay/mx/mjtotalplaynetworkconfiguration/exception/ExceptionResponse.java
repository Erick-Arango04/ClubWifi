package com.totalplay.mx.mjtotalplaynetworkconfiguration.exception;




public class ExceptionResponse {
	
	private String result;
	private String resultIdentifier;
	private String resultRescription;
	
	
	public ExceptionResponse(String result, String resultIdentifier, String resultRescription) {
		this.result = result;
		this.resultIdentifier = resultIdentifier;
		this.resultRescription = resultRescription;
	}


	public String getResult() {
		return result;
	}


	public void setResult(String result) {
		this.result = result;
	}


	public String getResultIdentifier() {
		return resultIdentifier;
	}


	public void setResultIdentifier(String resultIdentifier) {
		this.resultIdentifier = resultIdentifier;
	}


	public String getResultRescription() {
		return resultRescription;
	}


	public void setResultRescription(String resultRescription) {
		this.resultRescription = resultRescription;
	}
	
	

	
}
