package com.guerra.tecsup.model;

public class Login {

	
	private String username;
	private String password;
	private String grant_type="password";
	private String client_id="2";
	private String client_secret="q03flHoux0KNekRK0ICtEZ2CjfBTIDwGADx4094Y";
	
	

	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + ", grant_type=" + grant_type + ", client_id="
				+ client_id + ", client_secret=" + client_secret + "]";
	}


	public Login(String username, String password, String grant_type, String client_id, String client_secret) {
		super();
		this.username = username;
		this.password = password;
		this.grant_type = grant_type;
		this.client_id = client_id;
		this.client_secret = client_secret;
	}


	public Login() {
		super();
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getGrant_type() {
		return grant_type;
	}


	public String getClient_secret() {
		return client_secret;
	}


	public String getClient_id() {
		return client_id;
	}
	
	
	
	
	
	
}
