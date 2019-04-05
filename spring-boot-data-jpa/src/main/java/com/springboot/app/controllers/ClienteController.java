package com.springboot.app.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.springboot.app.models.entity.Cliente;
import com.springboot.app.models.service.IClienteService;

@Controller
@SessionAttributes("cliente")
public class ClienteController {
	
	@Autowired
	@Qualifier("clienteService")
	private IClienteService clienteService;
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de Clientes");
		model.addAttribute("clientes", clienteService.findAll());		
		return "listar";
	}
	
	
	@RequestMapping(value="/listar", method=RequestMethod.GET)
	public String listarClientes(Model model) {
		model.addAttribute("titulo", "Listado de Clientes");		
		model.addAttribute("clientes", clienteService.findAll());
		return "listar";
	}
	
	
	@RequestMapping(value="/form", method=RequestMethod.GET)
	public String crear(/*Map<String,Object> model*/ Model model) {
		Cliente cliente = new Cliente();
		model.addAttribute("titulo", "Cear Cliente");
		model.addAttribute("cliente", cliente);
		//model.put("titulo", "Crear Cliente");
		//model.put("cliente", cliente);
		return "alta";
	}

	@RequestMapping(value="/form", method=RequestMethod.POST)
	public String guadar(@Valid Cliente cliente, BindingResult result, Model model, SessionStatus status) {
		model.addAttribute("titulo", "Cear Cliente");
		if (result.hasErrors()) {
			return "alta";
		}

		clienteService.save(cliente);
		status.setComplete();
		return "redirect:/listar";
	}
	
	@RequestMapping(value="/form/{id}", method=RequestMethod.GET)
	public String editar(@PathVariable(value="id") Long id , Model model) {
		Cliente cliente = null;
		if (id > 0) {
			cliente = clienteService.finOne(id);
		}else {
			return "redirect:/listar";
		}

		model.addAttribute("titulo", "Editar Cliente");
		model.addAttribute("cliente", cliente);
		return "alta";
	}
	
	
	@RequestMapping(value="/eliminar/{id}", method=RequestMethod.GET)
	public String eliminar(@PathVariable(value="id") Long id ) {
		if (id > 0) {
			clienteService.delete(id);
		}
		return "redirect:/listar";
	}
}
