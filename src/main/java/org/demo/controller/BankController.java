package org.demo.controller;

import org.demo.entity.Bank;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BankController {
	
	   @PostMapping("/getBankDet")
	   @ResponseBody
        public String getBankDet(@ModelAttribute Bank bank) {
        	   
        	return "<table border = 2  cellspacing=10 cellpadding = 10>"+
        	  "<tr>"+
        	    "<th>"+"Id"+"</th>"+
        		"<th>"+"AccounholderName"+"</th>"+
        		"<th>"+"Bank_balance"+"</th>"+
        		"<th>"+"Deposit_amt"+"</th>"+
        		"<th>"+"Deposit_id"+"</th>"+
        		"<th>"+"Transaction_id"+"</th>"+
        		"<th>"+"branch"+"</th>"+
        		"<th>"+"account_type"+"</th>"+
        		"</tr>"+
        		
        		"<tr>"+
        		"<td>"+bank.getId()+"</td>"+
        		"<td>"+bank.getActholdername()+"</td>"+
        		"<td>"+bank.getBank_balance()+"</td>"+
        		"<td>"+bank.getDeposit_amt()+"</td>"+
        		"<td>"+bank.getDeposit_id()+"</td>"+
        		"<td>"+bank.getTrans_id()+"</td>"+
        		"<td>"+bank.getBranch()+"</td>"+
        		"<td>"+bank.getAccount_type()+"</td>"+
        		"</tr>"+
        		"</table>";
        	    
        }
}
