package org.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmpController {
	@GetMapping("/emp")
	@ResponseBody
    public String getEmp(@RequestParam(value = "name",required = false)String empName,
    		       @RequestParam(value="id" , required = false) int empId,
    		       @RequestParam(value="mobile", required = false ) double empMob,
    		       @RequestParam(value = "pass" , required = false) String empPass) {
    	
		return "<table border=2 cellspacing = '10' cellpadding = '10'>"+
		         "<tr>"+
		        "<th>"+"Name"+"</th>"+
				"<th>"+"Id"+"</th>"+
		        "<th>"+"Mobile"+"</th>"+
				"<th>"+"Password"+"</th>"+
		        "</tr>"+
				
		        "<tr>"+
		        "<td>"+empName+"</td>"+
		        "<td>"+empId+"</td>"+
		        "<td>"+empMob+"</td>"+
		        "<td>"+empPass+"</td>"+
		        "</tr>"+
		        
		        "</table>";
				
				
    }
}
