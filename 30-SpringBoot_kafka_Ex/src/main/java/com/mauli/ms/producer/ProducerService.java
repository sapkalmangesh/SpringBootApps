package com.mauli.ms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.mauli.ms.entity.StockQuote;
import com.mauli.ms.util.JsonUtil;

@Component
public class ProducerService {
	@Autowired
	private KafkaTemplate<String, String> template;
	
	@Autowired
	private JsonUtil jsonUtil;
	
	@Value("${my.topic.name}")
	private String destination; 
	
	public void sendData(StockQuote quote) {
		String data=jsonUtil.toJson(quote);
		template.send(destination,data);
		
	}

}
