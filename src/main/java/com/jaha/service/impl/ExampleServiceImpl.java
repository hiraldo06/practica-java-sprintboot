package com.jaha.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.jaha.model.Archivo;
import com.jaha.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {

	private static final Log LOG= LogFactory.getLog(ExampleServiceImpl.class);
	
	@Override
	public List<Archivo> getListFile() {
			
			List<Archivo> list = new ArrayList<>();
	
			list.add(new Archivo(1, "Juan Pedro", "43423-4324", "Femenino", "829-231-3232", new Date().toString()));
			list.add(new Archivo(2, "Juan Pichardo", "43423-4324", "Masculino", "829-231-3232", new Date().toString()));
			list.add(new Archivo(3, "Juan Cruz", "43423-4324", "Masculino", "829-231-3232", new Date().toString()));
			
			LOG.info("FROM SERVICE --METHOD: getListFile()");
		return list;
	}

	@Override
	public Archivo findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Archivo> findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
