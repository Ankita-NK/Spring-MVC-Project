package org.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExceptionController {
      @GetMapping("/getOpearate")
      @ResponseBody
	public Object optrn() {
		int a = 250;
		int b = 5;
		int res = a/b;
		System.out.println("The result is"+res);
		
		return "The result is :"+res;
	}
	
      @GetMapping("/getOperate1")
      @ResponseBody
      public Object oprtn1() {
    	  int a = 250;
    	  int b = 0;
    	  int res = a / b;
    	  System.out.println("The result is" + res);
    	  
    	  return "The result is"+res;
      }
	
      
      @ExceptionHandler(exception = ArithmeticException.class)
      @ResponseBody
	public String handleGetData(ArithmeticException ae) {
		return "Invalid opeartaion";
	}
}
