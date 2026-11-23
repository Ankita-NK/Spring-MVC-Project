package org.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class empController1 {
     
	@ResponseBody
	@GetMapping("/emp-details/{name}/{id}/{mobile}/{pass}")
	
	public String getEmpDet(@PathVariable("name") String ename,
			      @PathVariable("id") int eid,
			      @PathVariable("mobile") double ephone,
			      @PathVariable("pass") String epass
			
			) {
		 return "<table border = 2 cellspacing ='10' cellpadding = '10'>"+
			    "<tr>"+
				 "<th>"+"Name"+"</th>"+
			    "<th>"+"Id"+"</th>"+
				 "<th>"+"Mobile"+"</th>"+
			    "<th>"+"Password"+"</th>"+
				 "</tr>" +
			    
				 "<tr>"+
				 "<td>"+ename+"</td>"+
				 "<td>"+eid+"</td>"+
				 "<td>"+ephone+"</td>"+
				 "<td>"+epass+"</td>"+
				 "</tr>"+
				 
				 "</table>";
	}
	
	
}
