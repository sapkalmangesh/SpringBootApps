package com.mauli.ms.rest;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mauli.ms.entity.StockQuote;
import com.mauli.ms.producer.ProducerService;
import com.mauli.ms.store.MessageStore;

@RestController
public class MyKafkaRestController {
	
	@Autowired
	private MessageStore store;
	
	@Autowired
	private ProducerService service;
	
	//1. Send data /send?code=....&up=...
	@GetMapping("/send")
	public ResponseEntity<String> send
					(@RequestParam String code,
					 @RequestParam Double up)
	{
		StockQuote quote = new StockQuote();
		quote.setCode(code);
		quote.setUnitPrice(up);
		quote.setDateTime(new Date());
		
		service.sendData(quote);
		return ResponseEntity.ok("Data is Send");
		
	}
	
	
	//2.veiw data
	
	public ResponseEntity <List<StockQuote>> fetchData(){
		List<StockQuote> list=store.fetchAll();
		return ResponseEntity.ok(list);
	}

}
