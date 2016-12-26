package com.cable.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class CableController {
	
	@RequestMapping("/homgdfgdfe267")
	public ModelAndVgfdiew home() {
		System.out.println("fgfdContfgroller");
		String messfgfgfg= "Hellogdfgdf World, Spring MVC @ Javatpoint";
		return new ModelAndView("maingdfg", "message", message);
	}

	
}
