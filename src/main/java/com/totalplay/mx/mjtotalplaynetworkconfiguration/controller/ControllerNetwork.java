package com.totalplay.mx.mjtotalplaynetworkconfiguration.controller;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.totalplay.mx.mjtotalplaynetworkconfiguration.dao.SendRequest;



@RestController
public class ControllerNetwork {

	@Autowired
	private SendRequest request;
 	
	
	@PostMapping("/prueba")
	public NetworkResponseFull prueba( @RequestBody NetworkRequest networkResponse) throws ClientProtocolException, IOException {
	  
		 request.getResult(networkResponse);
		
		return new NetworkResponseFull ("0","" + (int)(Math.random()*99999999+1),"Petición realizada con éxito.","");
	}
	
	
	
}
