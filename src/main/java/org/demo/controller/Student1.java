package org.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Student1 {

	
	@RequestMapping(value="/fetch" , method=RequestMethod.GET)
	@ResponseBody
	public String getData() {
		return "Data fetched successfully";
	}
	
	@RequestMapping(value="/send" , method= RequestMethod.POST)
	@ResponseBody
	public String sendData() {
		return "Data sent succesfully";
	}
	
	@RequestMapping(value="/update" , method=RequestMethod.PUT)
	public String updateData() {
		return "Data updated";
	}
	
	
	@RequestMapping(value = "/delete" , method=RequestMethod.DELETE)
	public String delData() {
		return "Data deleted";
		
	}
}
