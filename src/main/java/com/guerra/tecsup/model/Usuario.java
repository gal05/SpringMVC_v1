package com.guerra.tecsup.model;

public class Usuario {
	
	private int id;
	private String email;
	private String password;
	private String name;
	private int codigo;
	private int tipo;
	
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(String email, String password, String name, int codigo, int tipo) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.codigo = codigo;
		this.tipo = tipo;
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
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
}
