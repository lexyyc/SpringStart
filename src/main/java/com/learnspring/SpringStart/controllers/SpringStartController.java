package com.learnspring.SpringStart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringStartController {
	
	@GetMapping("/hello")
	public String sayHello(Model model) {
		
		model.addAttribute("greetings", "Hello World");
		return "hello";
	}

}
