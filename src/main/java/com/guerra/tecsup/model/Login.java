package com.guerra.tecsup.model;

import com.google.gson.annotations.SerializedName;

public class Login {

	@SerializedName("token_type")
	private String token_type;
	@SerializedName("expires_in")
	private String expires_in;
	@SerializedName("token")
	private String token;
	@SerializedName("id")
	private int id;
	@SerializedName("email")
	private String email;
	@SerializedName("name")
	private String name;
	@SerializedName("codigo")
	private String codigo;
	@SerializedName("tipo")
	private String tipo;
	
	
	
	
	
	public Login() {
		super();
	}
	public Login(String token_type, String expires_in, String token, int id, String email, String name, String codigo,
			String tipo) {
		super();
		this.token_type = token_type;
		this.expires_in = expires_in;
		this.token = token;
		this.id = id;
		this.email = email;
		this.name = name;
		this.codigo = codigo;
		this.tipo = tipo;
	}
	public String getToken_type() {
		return token_type;
	}
	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}
	public String getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Login [token_type=" + token_type + ", expires_in=" + expires_in + ", token=" + token + ", id=" + id
				+ ", email=" + email + ", name=" + name + ", codigo=" + codigo + ", tipo=" + tipo + "]";
	}
	
	
	
	
	
	









	
	
	
	
}
