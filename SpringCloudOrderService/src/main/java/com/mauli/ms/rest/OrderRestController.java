package com.mauli.ms.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mauli.ms.consumer.IStockConsumerFeign;
import com.mauli.ms.consumer.StockConsumer;

@RestController
@RequestMapping("/order")
public class OrderRestController {
	
	/*@Autowired
	private StockConsumer consumer;
	*/
	@Autowired
	private IStockConsumerFeign consumer;
	
	@GetMapping("/data")
	public ResponseEntity<String> findOrder(){
		System.out.println(consumer.getClass().getName());
		String msg = consumer.showMessage().getBody();
		return ResponseEntity.ok("FROM ORDER SERVICE..... "+msg);
	}

}
