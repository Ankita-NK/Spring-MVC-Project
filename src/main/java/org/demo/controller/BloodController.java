package org.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BloodController {
       
	@GetMapping("/getBlood")
	  public String getData(Model model) {
		  model.addAttribute("id", "1");
		  model.addAttribute("name", "Smith");
		  model.addAttribute("email", "smith@123gmail.com");
		  model.addAttribute("mobile", "6756747989");
		  model.addAttribute("group", "B+");
		  return "blood";
		  
	  }
	
	
}
