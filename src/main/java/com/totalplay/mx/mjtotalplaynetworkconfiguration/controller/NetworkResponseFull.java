package com.totalplay.mx.mjtotalplaynetworkconfiguration.controller;

public class NetworkResponseFull {

	 private NetworkResultResponse results;
	    private String code;
		
	    NetworkResponseFull (String result, String resultIdentifier, String resultDescription, String code ){
			
			results = new NetworkResultResponse( result, resultIdentifier, resultDescription);
			this.code = code;
			
		}
		
		public NetworkResultResponse getResults() {
			return results;
		}
		
		public String getCode() {
			return code;
		}

		
}
