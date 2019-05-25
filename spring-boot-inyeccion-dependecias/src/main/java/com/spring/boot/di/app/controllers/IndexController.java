package com.spring.boot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.boot.di.app.models.service.IMiServicio;


@Controller
public class IndexController {

	@Autowired
	@Qualifier("miServicioSimple") 
	IMiServicio miServicioSimple;

	@Autowired
	@Qualifier("miServicioComplejo") 
	IMiServicio miServicioComplejo;
	
	/*
	@Autowired
	public IndexController(IMiServicio miServicio) {
		this.miServicio = miServicio;
	}*/

	@GetMapping(value= {"/","","/home","/index"})
	public String index(Model model) {

		model.addAttribute("objeto", miServicioSimple.operacion());
		model.addAttribute("objeto2", miServicioComplejo.operacion());
		return "index";
	}

	/*public IMiServicio getMiServicio() {
		return miServicio;
	}*/

	/*@Autowired
	@Qualifier("miServicioSimple")
	public void setMiServicio(IMiServicio miServicio) {
		this.miServicio = miServicio;
	}*/
	
}
