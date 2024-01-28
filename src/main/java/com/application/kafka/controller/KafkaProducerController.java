package com.application.kafka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.kafka.producer.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class KafkaProducerController {

	private KafkaProducer kafkaproducer;

	public KafkaProducerController(KafkaProducer kafkaproducer) {
		super();
		this.kafkaproducer = kafkaproducer;
	}
	@GetMapping("/publish")
	public ResponseEntity<String> publish(@RequestParam("message") String message){
		 kafkaproducer.sendMessage(message);
		return ResponseEntity.ok("Message sent to kafka topic");
	}
	
}
