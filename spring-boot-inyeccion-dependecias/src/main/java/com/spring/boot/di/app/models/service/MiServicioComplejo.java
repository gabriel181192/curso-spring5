package com.spring.boot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
	
//@Component("miServicioComplejo")
//@Primary //Para Service por defecto
//@Service
public class MiServicioComplejo implements IMiServicio{

	
	public String operacion() {
		
		return "Ejecutando mètodo de logica de negocio muy complicado...";
	}
}
