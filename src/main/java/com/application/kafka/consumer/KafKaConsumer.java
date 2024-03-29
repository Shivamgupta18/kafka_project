package com.application.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.application.kafka.util.AppConstants;

@Service
public class KafKaConsumer {

	
	private static final Logger logger=LoggerFactory.getLogger(KafKaConsumer.class);
	
	
	@KafkaListener(topics = AppConstants.TOPIC_NAME, groupId = AppConstants.GROUP_ID)
	public void message(String message) {
		 logger.info(String.format("message received -> %s",message));
	}
}
