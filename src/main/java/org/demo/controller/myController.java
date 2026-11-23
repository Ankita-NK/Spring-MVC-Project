package org.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class myController {
     
	@GetMapping("/home")
	@ResponseBody
	public String home() {
		return "This is Home page";
	}
	
	@GetMapping("/about")
	@ResponseBody
	public String about() {
		return "This is About page";
	}
}
