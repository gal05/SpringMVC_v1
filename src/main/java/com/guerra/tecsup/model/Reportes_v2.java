package com.guerra.tecsup.model;

public class Reportes_v2 {
	
	private int id;
	private String cliente;
	private String sede;
	private String pabellon;
	private String salon;
	private String tipo;
	private String imagen;
	private String fecha;
	private String hora;
	private String observacion;
	private String estado;
	
	
	
	public Reportes_v2() {
		super();
	}
	public Reportes_v2(int id, String cliente, String sede, String pabellon, String salon, String tipo, String imagen,
			String fecha, String hora, String observacion, String estado) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.sede = sede;
		this.pabellon = pabellon;
		this.salon = salon;
		this.tipo = tipo;
		this.imagen = imagen;
		this.fecha = fecha;
		this.hora = hora;
		this.observacion = observacion;
		this.estado = estado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public String getPabellon() {
		return pabellon;
	}
	public void setPabellon(String pabellon) {
		this.pabellon = pabellon;
	}
	public String getSalon() {
		return salon;
	}
	public void setSalon(String salon) {
		this.salon = salon;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
