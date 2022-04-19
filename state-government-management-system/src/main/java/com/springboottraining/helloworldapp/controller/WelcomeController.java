package com.springboottraining.helloworldapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//its always recomended to add the 
@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String showWelcomeMessage() {
		return "Hello! Am In";
	}
	
	@GetMapping("/wish")
	public String showWishMessage() {
		return "Hello! Good Morning";
	}
	
	@GetMapping("/test")
	public String test() {
		return "Application is up";
	}

}
