package com.jaha.service;

import java.util.List;

import com.jaha.model.Archivo;

public interface ExampleService {
	
	public abstract List<Archivo> getListFile();
	public abstract Archivo findById(int id);
	public abstract List<Archivo>findByNombre(String nombre);
	
}
