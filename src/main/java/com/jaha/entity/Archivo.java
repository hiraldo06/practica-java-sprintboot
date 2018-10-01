package com.jaha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="archivo")
public class Archivo {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="cedula")
	private String cedula;
	
	
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="fecha")
	private String fecha;
	
	public Archivo(){}
	
	public Archivo(int id, String nombre, String cedula, String telefono, String fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cedula = cedula;
		
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
		return "Archivo [id=" + id + ", nombre=" + nombre + ", cedula=" + cedula  + ", telefono="
				+ telefono + ", fecha=" + fecha + "]";
	}
	
	

}
