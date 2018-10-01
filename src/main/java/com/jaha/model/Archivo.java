package com.jaha.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Archivo {
	
	private int id;
	
	@NotNull
	@Size(min=3, max=50)
	private String nombre;
	
	private String cedula;
	private String sexo;
	private String telefono;
	private String fecha;
	
	public Archivo(){}
	
	public Archivo(int id, String nombre, String cedula, String sexo, String telefono, String fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cedula = cedula;
		this.sexo = sexo;
		this.telefono = telefono;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Archivo [id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", sexo=" + sexo + ", telefono="
				+ telefono + ", fecha=" + fecha + "]";
	}
	
	

}
