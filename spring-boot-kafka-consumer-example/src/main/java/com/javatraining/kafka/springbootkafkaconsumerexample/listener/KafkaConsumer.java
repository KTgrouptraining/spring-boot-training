package com.javatraining.kafka.springbootkafkaconsumerexample.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.javatraining.kafka.springbootkafkaconsumerexample.model.User;

@Service
public class KafkaConsumer {

   /* @KafkaListener(topics = "testtopic", group = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message:=============> " + message);
    }
*/

	@KafkaListener(topics = "usertopic", group = "group_json", containerFactory = "userKafkaListenerFactory")
	public void consumeJson(User user) {

		System.out.println("Received user name from the queue:"
				+ user.getName());
		//all th remaning opertion he
		
		//in db
	System.out.println("Consumed JSON Message: " + user);
	}
}
