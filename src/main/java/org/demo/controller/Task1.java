package org.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Task1 {
	
	@ResponseBody
	@GetMapping("/student-det")
	public String getData() {
            
   String name1 = "ram";
   String email1 = "ram@gmail.com";
   long mobile1 = 6787267543l;
   String password1 = "ram@321";
   String address1 = "bengaluru";
   String gender1 = "male";
   
   String name2 = "bhim";
   String email2 = "bhim@gmail.com";
   long mobile2 = 654614516l;
   String password2 = "bhim@321";
   String address2 = "gadag";
   String gender2 = "male";
   
   
   String name3 = "Lakshman";
   String email3 = "lakshman@gmail.com";
   long mobile3 = 9876543210L;
   String password3 = "lakshman@321";
   String address3 = "Mysore";
   String gender3 = "male";
   
   String name4 = "Sita";
   String email4 = "sita@gmail.com";
   long mobile4 = 8765432109L;
   String password4 = "sita@321";
   String address4 = "Bengaluru";
   String gender4 = "female";
   
   String name5 = "Urmila";
   String email5 = "urmila@gmail.com";
   long mobile5 = 7654321098L;
   String password5 = "urmila@321";
   String address5 = "Hubli";
   String gender5 = "female";
   
   String name6 = "Mandodari";
   String email6 = "mandodari@gmail.com";
   long mobile6 = 6543210987L;
   String password6 = "mandodari@321";
   String address6 = "Dharwad";
   String gender6 = "female";
   
   String name7 = "Hanuman";
   String email7 = "hanuman@gmail.com";
   long mobile7 = 9432167850L;
   String password7 = "hanuman@321";
   String address7 = "Haveri";
   String gender7 = "male";

   String name8 = "Ravana";
   String email8 = "ravana@gmail.com";
   long mobile8 = 8321456709L;
   String password8 = "ravana@321";
   String address8 = "Tumkur";
   String gender8 = "male";
   
   String name9 = "Kaikeyi";
   String email9 = "kaikeyi@gmail.com";
   long mobile9 = 7213456789L;
   String password9 = "kaikeyi@321";
   String address9 = "Belgaum";
   String gender9 = "female";
   
   String email10 = "bharat@gmail.com";
   long mobile10 = 654614516L;
   String password10 = "bharat@321";
   String address10 = "Gadag";
   String gender10 = "male";
   
   
   return "<table border= 2 cellspacing = '10' cellpadding= 10>"+
        "<tr>"+
       "<th>Name</th>"+
        "<th>Email</th>"+
       "<th>Mobile</th>"+
        "<th>Pasword</th>"+
       "<th>Address</th>"+
        "<th>Gender</th>"+
       "</tr>" +
        
      
        "<tr>"+
        "<td>"+name1+"</td>"+
        "<td>"+email1+"</td>"+
        "<td>"+mobile1+"</td>"+
        "<td>"+password1+"</td>"+
        "<td>"+address1+"</td>"+
        "<td>"+gender1+"</td>"+
        "</tr>"+
        
"<tr>"+
"<td>"+name2+"</td>"+
"<td>"+email2+"</td>"+
"<td>"+mobile2+"</td>"+
"<td>"+password2+"</td>"+
"<td>"+address2+"</td>"+
"<td>"+gender2+"</td>"+
"</tr>"+
        
"<tr>"+
"<td>"+name3+"</td>"+
"<td>"+email3+"</td>"+
"<td>"+mobile3+"</td>"+
"<td>"+password3+"</td>"+
"<td>"+address3+"</td>"+
"<td>"+gender3+"</td>"+
"</tr>"+

"<tr>"+
"<td>"+name4+"</td>"+
"<td>"+email4+"</td>"+
"<td>"+mobile4+"</td>"+
"<td>"+password4+"</td>"+
"<td>"+address4+"</td>"+
"<td>"+gender4+"</td>"+
"</tr>"+

"<tr>"+
"<td>"+name5+"</td>"+
"<td>"+email5+"</td>"+
"<td>"+mobile5+"</td>"+
"<td>"+password5+"</td>"+
"<td>"+address5+"</td>"+
"<td>"+gender5+"</td>"+
"</tr>"+

"<tr>"+
"<td>"+name6+"</td>"+
"<td>"+email6+"</td>"+
"<td>"+mobile6+"</td>"+
"<td>"+password6+"</td>"+
"<td>"+address6+"</td>"+
"<td>"+gender6+"</td>"+
"</tr>"+

"<tr>"+
"<td>"+name7+"</td>"+
"<td>"+email7+"</td>"+
"<td>"+mobile7+"</td>"+
"<td>"+password7+"</td>"+
"<td>"+address7+"</td>"+
"<td>"+gender7+"</td>"+
"</tr>"+

"<tr>"+
"<td>"+name8+"</td>"+
"<td>"+email8+"</td>"+
"<td>"+mobile8+"</td>"+
"<td>"+password8+"</td>"+
"<td>"+address8+"</td>"+
"<td>"+gender8+"</td>"+
"</tr>"+

"<tr>"+
"<td>"+name9+"</td>"+
"<td>"+email9+"</td>"+
"<td>"+mobile9+"</td>"+
"<td>"+password9+"</td>"+
"<td>"+address9+"</td>"+
"<td>"+gender9+"</td>"+
"</tr>"+

        "</table>";
        
       
}
}
