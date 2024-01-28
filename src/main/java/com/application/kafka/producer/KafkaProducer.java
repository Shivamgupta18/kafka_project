package com.application.kafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.application.kafka.util.AppConstants;

@Service
public class KafkaProducer {

	public static final Logger logger=LoggerFactory.getLogger(KafkaProducer.class);
	
	@Autowired
	private KafkaTemplate<String, String> kafkatemplate;
	
	public void sendMessage(String message) {
		logger.info(String.format("Message send-> %s", message));
		kafkatemplate.send(AppConstants.TOPIC_NAME, message);
	}
	
}
