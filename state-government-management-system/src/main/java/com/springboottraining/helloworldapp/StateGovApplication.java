package com.springboottraining.helloworldapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class StateGovApplication {

	public static void main(String[] args) {
		System.out.println();
		SpringApplication.run(StateGovApplication.class, args) ; 
		
	}
	
	

}
