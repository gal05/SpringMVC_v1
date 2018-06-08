package com.guerra.tecsup.model;

public class Reporte {
	
  private int  id;
  private int cliente;
  private String sede;
  private int pabellon;
  private int salon;
  private String tipo;
  private String observacion;
  private String   estado;
  private String  imagen;
  private String  fecha;
  private String  hora;
  
  
  
  
  
  
public Reporte() {
	super();
}
public Reporte(int id, int cliente, String sede, int pabellon, int salon, String tipo, String observacion, String estado, String imagen,
		String fecha, String hora) {
	super();
	this.id = id;
	this.cliente = cliente;
	this.sede = sede;
	this.pabellon = pabellon;
	this.salon = salon;
	this.tipo = tipo;
	this.observacion = observacion;
	this.estado = estado;
	this.imagen = imagen;
	this.fecha = fecha;
	this.hora = hora;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCliente() {
	return cliente;
}
public void setCliente(int cliente) {
	this.cliente = cliente;
}
public String getSede() {
	return sede;
}
public void setSede(String sede) {
	this.sede = sede;
}
public int getPabellon() {
	return pabellon;
}
public void setPabellon(int pabellon) {
	this.pabellon = pabellon;
}
public int getSalon() {
	return salon;
}
public void setSalon(int salon) {
	this.salon = salon;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
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
  
  
  
  
  
	

}
