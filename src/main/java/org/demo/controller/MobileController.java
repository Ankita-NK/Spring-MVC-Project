package org.demo.controller;

import org.demo.entity.Mobile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MobileController {

	  @PostMapping("/getMob")
	  @ResponseBody
	  public String getMob( @ModelAttribute Mobile mobile) {
		  return  "<table border = 1 cellspacing = 10 cellpadding = 10>"+
	  		 "<tr>"+
	  		 "<th>"+"Id"+"</th>"+
	  		 "<th>"+"Name"+"</th>"+
	  		 "<th>"+"Color"+"</th>"+
	  		 "<th>"+"Price"+"</th>"+
	  		 "<th>"+"Model"+"</th>"+
	  		 "<th>"+"Processor"+"</th>"+
	  		 "<th>"+"Rom"+"</th>"+
	  		 "</tr>"+
	  		 
	  		 "<tr>"+
	  		 "<td>"+mobile.getId()+"</td>"+
	  		"<td>"+mobile.getName()+"</td>"+
	  		 "<td>"+mobile.getColor()+"</td>"+
	  		 "<td>"+mobile.getPrice()+"</td>"+
	  		 "<td>"+mobile.getModel()+"</td>"+
	  		 "<td>"+mobile.getProcessor()+"</td>"+
	  		 "<td>"+mobile.getRom()+"</td>"+
	  		 "</tr>"+
	  		 "</table>";
	         
	  		 
	  }
}
