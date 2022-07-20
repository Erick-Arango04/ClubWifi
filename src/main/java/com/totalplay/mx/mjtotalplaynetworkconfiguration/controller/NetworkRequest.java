package com.totalplay.mx.mjtotalplaynetworkconfiguration.controller;

public class NetworkRequest {
	
	private String account;
	private String flag;
	
	public NetworkRequest(String account, String flag) {
		this.account = account;
		this.flag = flag;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	

}
