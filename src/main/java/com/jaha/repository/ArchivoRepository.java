package com.jaha.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaha.entity.Archivo;

@Repository("archivoRepository")
public interface ArchivoRepository extends JpaRepository<Archivo, Serializable>{
	public abstract Archivo findById(int id);
	
	public abstract List<Archivo>findByNombre(String nombre);   
	
	
	
	
}
