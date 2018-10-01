package com.jaha.componet;

//import java.util.List;

//import javax.websocket.Session;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
/*import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;*/
import org.springframework.stereotype.Component;

import com.jaha.entity.Archivo;
import com.jaha.repository.ArchivoRepository;

//import com.jaha.model.Archivo;

@Component("exampleComponet")
public class ExampleComponet {
	public static final Log LOG=LogFactory.getLog(ExampleComponet.class);
	/*
	@Autowired
    private SessionFactory sessionFactory;

    public Session getSession() {
        return (Session) sessionFactory.getCurrentSession();
    }
	
    
    @SuppressWarnings("unchecked")
	public List<Archivo>listarArchivo(){
    	List<Archivo>list=null;
//      Session se=getSession();
      try {
         
          Query query = ((SharedSessionContract) getSession()).createQuery("from TbDoctor");
          
          list=(List<Archivo>)query.list();
          System.out.println(list.toString());
          return  list;
         // return "hola mundo";
      }catch(HibernateException | DataAccessException ex){
          System.out.println(ex);
          return list;
      }
    	
    	
    }
    */
	
	@Autowired
	@Qualifier("archivoRepository")
	private ArchivoRepository archivoRepository;
	
	public void sayHello(){
		LOG.info("Hello from example componet");
		LOG.info("METHOD:sayHello() RESULT: "+archivoRepository.findById(1).toString());
		
		for(Archivo archivo:archivoRepository.findByNombre("Julio")){
			LOG.info("METHOD:sayHello() RESULT: "+archivo.toString());
		}
		//listarArchivo();
	}
}
