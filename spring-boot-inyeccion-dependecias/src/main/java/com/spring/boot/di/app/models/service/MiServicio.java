package com.spring.boot.di.app.models.service;

import org.springframework.stereotype.Component;
	
//@Component("miServicioSimple")
//@Service
public class MiServicio implements IMiServicio{

	
	public String operacion() {
		
		return "Ejecutando mètodo de logica de negocio simple...";
	}
}
