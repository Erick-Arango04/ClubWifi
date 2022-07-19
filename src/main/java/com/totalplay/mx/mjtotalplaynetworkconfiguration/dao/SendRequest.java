package com.totalplay.mx.mjtotalplaynetworkconfiguration.dao;



import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Component;


@Component
public class SendRequest {

	public void getResult() throws ClientProtocolException, IOException  {
		
		 HttpClient client_object = HttpClientBuilder.create().build();
		 
		   HttpPost request_object = new HttpPost("http://10.216.48.105/ClubWifi/ClubWifi.asmx");
		   request_object.addHeader("content-Type", "text/xml");
	
		   StringEntity entity_object = new StringEntity("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\"> \n"+
		  "<soapenv:Header/>\n"+
		   "<soapenv:Body>\n"+
		      "<tem:EnabledClubWifi>\n"+
		         "<!--Optional:-->\n" +
		         "<tem:Account>0190018156</tem:Account>\n"+
		         "<tem:Flag>0</tem:Flag>\n"+
		      "</tem:EnabledClubWifi>\n" +
		   "</soapenv:Body>\n" +
		"</soapenv:Envelope>\n");
		   
		request_object.setEntity(entity_object);
		
		 HttpResponse response_object = client_object.execute(request_object);
		 
		 // parseo de XML a JSON
		 
		  String string_body = EntityUtils.toString(response_object.getEntity());
		  JSONObject json_body = XML.toJSONObject(string_body);
		 
		  String soap_envelope = json_body.get("soap:Envelope").toString();
		  JSONObject soap_envelope_object = new JSONObject (soap_envelope);
		  
		  String soap_envelope_string= soap_envelope_object.get("soap:Body").toString();
		  
		  JSONObject soap_enable_object = new JSONObject (soap_envelope_string);
		  String soap_enable_string = soap_enable_object.get("EnabledClubWifiResponse").toString();
		  
		  JSONObject soap_result_object = new JSONObject (soap_enable_string);
		  String soap_result_string= soap_result_object.get("EnabledClubWifiResult").toString();
		  
		  JSONObject soap_result = new JSONObject (soap_result_string);
		  String soap_resul = soap_result.get("Result").toString();
		  
	      System.out.print(soap_resul);
		
	}
}
