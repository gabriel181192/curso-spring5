package com.spring.boot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.boot.di.app.models.domain.Factura;

@Controller
public class FacturaController {

	@Autowired
	Factura factura;
	
	@GetMapping("/ver")
	public String index(Model model) {
		System.out.println("Paso aquiiii");
		model.addAttribute("titulo", "Ejemplo de Factura con inyeccion dependecias");
		model.addAttribute("factura", factura);
		System.out.println(factura.getCliente().getNombre());
		return "factura/ver";
	}
}
