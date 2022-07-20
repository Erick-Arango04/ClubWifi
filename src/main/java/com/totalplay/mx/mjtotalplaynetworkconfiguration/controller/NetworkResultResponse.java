package com.totalplay.mx.mjtotalplaynetworkconfiguration.controller;


public class NetworkResultResponse {
	
	
	private String result;
	private String resultIdentifier;
	private String resultDescription;
	
	
	
	public NetworkResultResponse(String result, String resultIdentifier, String resultDescription) {
		this.result = result;
		this.resultIdentifier = resultIdentifier;
		this.resultDescription = resultDescription;
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
	public String getResultDescription() {
		return resultDescription;
	}
	public void setResultDescription(String resultDescription) {
		resultDescription = resultDescription;
	}
	
	

}
