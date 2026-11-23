package org.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Student3 {
	@GetMapping("/students")
	@ResponseBody
   public String getData() {
	   
	   int id = 1;
	   String name = "Ram";
	   String email = "ram@gmail.com";
	   return "<table border=2 cellspacing=10 cellpadding = 10>"+
	   		 "<tr>" +
			   "<th>"+"ID"+"</th>"+
	   		   "<th>"+"Name"+"</th>"+
			   "<th>"+"Email"+"</th>"+
	   		   "</tr>"+
			   
	   		   "<tr>"+
	   		   "<td>"+id+"</td>"+
	   		   "<td>"+name+"</td>"+
	   		   "<td>"+email+"</td>"+
	   		   "</tr>"+
	   		  "</table>";
   }
}
