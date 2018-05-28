package com.guerra.tecsup.model;

public class InfoUser {

	
	private int id;
	private String email;
	private String password;
	private String name;
	private String codigo;
	private int tipo;
	private String remember_token;
	
	
	
	
	public InfoUser() {
		super();
	}
	public InfoUser(int id, String email, String password, String name, String codigo, int tipo,
			String remember_token) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.codigo = codigo;
		this.tipo = tipo;
		this.remember_token = remember_token;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getRemember_token() {
		return remember_token;
	}
	public void setRemember_token(String remember_token) {
		this.remember_token = remember_token;
	}
	@Override
	public String toString() {
		return "InfoUser [id=" + id + ", email=" + email + ", password=" + password + ", name=" + name + ", codigo="
				+ codigo + ", tipo=" + tipo + ", remember_token=" + remember_token + "]";
	}
	
	
	
	
}
