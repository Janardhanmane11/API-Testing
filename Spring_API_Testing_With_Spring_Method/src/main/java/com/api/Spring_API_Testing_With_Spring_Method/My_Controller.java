package com.api.Spring_API_Testing_With_Spring_Method;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/Bank")


public class My_Controller {

	@RequestMapping(value = "/account", method = RequestMethod.PUT)
       private String FirstAPI() {
    	   return"Open a new account here";
       }
	
	
	@RequestMapping(value="/cashier",method = RequestMethod.GET)
	private String SecondAPI() {
		return "Withdraw your money ";
	}
	
	@RequestMapping(value="/manager", method= RequestMethod.POST)
	private String ThirdAPI() {
		return"Meet only for higher level issue";
	}
	
	@RequestMapping(value = "/helpdesk", method = RequestMethod.DELETE)
	private String FourthAPI() {
		return"You will get all the info";
	}
	
	
	
	
	
}
