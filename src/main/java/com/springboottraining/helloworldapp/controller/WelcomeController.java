package com.springboottraining.helloworldapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//its always recomended to add the 
@RestController
public class WelcomeController {

	@RequestMapping("/welcome")
	public String showWelcomeMessage() {
		return "Hello! Am In";
	}
	
	@RequestMapping("/wish")
	public String showWishMessage() {
		return "Hello! Good Morning";
	}
	
	@RequestMapping("/test")
	public String test() {
		return "Application is up";
	}

}
