package com.javatraining.kafka.springbootkafkaproducerexample.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatraining.kafka.springbootkafkaproducerexample.model.User;

@RestController
@RequestMapping("kafka")
public class UserController {

	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;
	
	/*@Autowired
	private KafkaTemplate<String, String> kafkaTemplateForStringObject;*/

	private static final String USSER_TOPIC = "usertopic";
	private static final String TEST_TOPIC = "testtopic";

	@GetMapping("/publish/{name}")
	public String post(@PathVariable("name") final String name) {
		//public String post(@requestbods object) {
		//image amazon3 s3
		//url:
//		kafkaTemplateForStringObject.send(TEST_TOPIC, "Hello+======>" + name+" Posted on :"+new Date());		

		kafkaTemplate.send(USSER_TOPIC, new User(name, "Technology", 12000L));

		return "Published successfully";
	}
	
	/*@PostMapping("/publish")
	public String postappingExample( @RequestBody User user) {
		return null;
	}*/
}
