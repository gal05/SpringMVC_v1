package com.guerra.tecsup.model;

public class Reporte {
	
  private int  id;
  private int user_id;
  private int maquinaria_id;
  private int aula_id;
  private String observacion;
  private String   estadorep;
  private String  imagen;
  private String  fecha;
  private String  hora;
  
  
  
  
  
  
public Reporte() {
	super();
}
public Reporte(int id, int user_id, int maquinaria_id, int aula_id, String observacion, String estadorep, String imagen,
		String fecha, String hora) {
	super();
	this.id = id;
	this.user_id = user_id;
	this.maquinaria_id = maquinaria_id;
	this.aula_id = aula_id;
	this.observacion = observacion;
	this.estadorep = estadorep;
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
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public int getMaquinaria_id() {
	return maquinaria_id;
}
public void setMaquinaria_id(int maquinaria_id) {
	this.maquinaria_id = maquinaria_id;
}
public int getAula_id() {
	return aula_id;
}
public void setAula_id(int aula_id) {
	this.aula_id = aula_id;
}
public String getObservacion() {
	return observacion;
}
public void setObservacion(String observacion) {
	this.observacion = observacion;
}
public String getEstadorep() {
	return estadorep;
}
public void setEstadorep(String estadorep) {
	this.estadorep = estadorep;
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
