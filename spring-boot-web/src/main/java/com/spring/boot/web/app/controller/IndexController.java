package com.spring.boot.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping(value="/app") //Rutas de primer nivel
public class IndexController {

	
	//@RequestMapping(value="/index",method=RequestMethod.GET) //Forma uno
	@GetMapping(value= {"/index","/home","/",""})
	public String index(Model model /*, ModelAndView mv*/) {
		
		model.addAttribute("titulo", "Hola pasando datos desde Controller");
		/*mv.setViewName("index");*/
		return "index";
	}
	
}
