package org.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Student2 {
	
	
	@GetMapping("/Student2")
	@ResponseBody
     public String getData() {
    	 return "Data is fetched";
     }
     
	@PostMapping("/Student2")
	@ResponseBody
     public String sendData() {
    	 return "Data is sent";
     }
     
	@PatchMapping("/Student2")
	@ResponseBody
     public String updateData() {
    	 return "Data is updated";
     }
     
	
	@DeleteMapping("/Student2")
	@ResponseBody
     public String delData() {
    	 return "Data is deleted";
     }
}
