package com.cable.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class CableController {
	
	@RequestMapping("/home")
	public ModelAndView home() {
		System.out.println("Controller");
		String message = "Hello World, Spring MVC @ Javatpoint";
		return new ModelAndView("main", "message", message);
	}

	
}
