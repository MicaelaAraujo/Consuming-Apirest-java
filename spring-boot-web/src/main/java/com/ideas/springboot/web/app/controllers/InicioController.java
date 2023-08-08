package com.ideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {
	
	@GetMapping({"/inicio", "/", "/home"})
	public String inicio() {
		
		return "inicio";
	}

}
