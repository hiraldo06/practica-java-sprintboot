package com.jaha.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorsController {
	
	@ExceptionHandler(Exception.class)
	public String show(){
		return "error/500";
	}
}
