package com.tka.Spring_API_Testing_With_SpringBoot_Method;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/Hospital")

public class My_Controllers {
	
	@PutMapping("/bloodbank")
	private String FirstAPI() {
		return "Here you can donate your blood";
	}
	
	@PostMapping("/ICU")
	private String SecondAPI() {
		return "This department is only for ventilater patient ";
	}
	
	@GetMapping("/seniour citizen")
	private String ThirdAPI() {
		return"Booked only for seniour citizen";
	}
	
	@DeleteMapping("/medical")
	private String FourthAPI() {
		return"You will get all the medicine";
	}
	
	
	
	
	

}
