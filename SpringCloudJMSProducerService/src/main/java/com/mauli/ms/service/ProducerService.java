package com.mauli.ms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class ProducerService {
	
	@Autowired
	private JmsTemplate jt;
	
	@Value("$(my.app.dest-name)")
	private String destinationName;
	
	public void sendMessage(String message) {
		MessageCreator messageCreator = session -> session.createTextMessage(message);
		jt.send(destinationName, messageCreator);
	}

}
