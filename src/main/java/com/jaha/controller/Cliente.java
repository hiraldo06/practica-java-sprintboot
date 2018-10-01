package com.jaha.controller;



import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jaha.componet.ExampleComponet;
import com.jaha.model.Archivo;
import com.jaha.service.ExampleService;

@Controller
@RequestMapping("/")
public class Cliente {
	
	public static final String INDEX_VIEW="vista/index";
	public static final Log LOGGER =LogFactory.getLog(Cliente.class);
	
	
	//agregando componente
	@Autowired
	@Qualifier("exampleComponet")
	private ExampleComponet exampleComponet;
	
	@Autowired
	@Qualifier("exampleService")
	private ExampleService exampleService;
	
	
	//primera forma
	@GetMapping("/")
	public String hello(Model model){
		model.addAttribute("name","Tabla de Archivo");
		model.addAttribute("archivos",exampleService.getListFile());
		
		exampleComponet.sayHello();
		
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WAR TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG TRACE");
		return INDEX_VIEW;
	}
	
	//segunda forma
	@GetMapping("/model")
	public ModelAndView exampleMAV(){
		ModelAndView mav =new ModelAndView(INDEX_VIEW);
		mav.addObject("name", "Tabla de Archivo");
	
		return mav;
	}
	
	@GetMapping("/registro")
	public String archivo(Model model){
		model.addAttribute("name", "Tabla de archivo");
		model.addAttribute("form_name", "Formulario De Archivos");
		model.addAttribute("archivo",new Archivo());
		model.addAttribute("archivos",exampleService.getListFile());
		return "vista/archivos";
	}
	@PostMapping("/addFile")
	public ModelAndView addFile(
			@Valid
			@ModelAttribute("archivo") Archivo archivo,BindingResult bindingResult){
		ModelAndView mov=new ModelAndView();
		if(bindingResult.hasErrors()){
			mov.setViewName("vista/archivos");
		}else{
			mov.setViewName("vista/index");
		}
		
		return mov;
	}
	
}
