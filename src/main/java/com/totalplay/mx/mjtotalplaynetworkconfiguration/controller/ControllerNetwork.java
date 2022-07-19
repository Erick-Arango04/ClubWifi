package com.totalplay.mx.mjtotalplaynetworkconfiguration.controller;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.totalplay.mx.mjtotalplaynetworkconfiguration.dao.SendRequest;

@RestController
public class ControllerNetwork {

	@Autowired
	private SendRequest request;
 	
	
	@PostMapping("/prueba")
	public void prueba() throws ClientProtocolException, IOException {
	  
		 request.getResult();
		
	}
	
	
	
}
