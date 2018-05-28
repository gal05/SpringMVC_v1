package com.guerra.tecsup.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class LoginOne {

	
	@SerializedName("token_type")
	private List<Login> login;

	public List<Login> getLogin() {
		return login;
	}

	public void setLogin(List<Login> login) {
		this.login = login;
	}
	
	
	
}
