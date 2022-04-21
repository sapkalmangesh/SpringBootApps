package com.mauli.ms.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mauli.ms.consumer.IStockConsumerFeign;
import com.mauli.ms.model.Stock;

@RestController
@RequestMapping("/order")
public class OrderRestController {

	@Autowired
	private IStockConsumerFeign consumer;
	
	@GetMapping("/data")
	public ResponseEntity<String> findOrder(){

		System.out.println("IStockConsumerFeign class name===>"+consumer.getClass().getName());
		String msg = consumer.showMessage().getBody();
		return ResponseEntity.ok("FROM ORDER SERVICE...."+msg);

	}
	@GetMapping("/data/{id}")
	public ResponseEntity<Stock> getStockById(@PathVariable long id){
		Stock stock = consumer.getOneStock(id).getBody();
		return ResponseEntity.ok(stock);

	}
	
	@PostMapping("/creates")
	public ResponseEntity<String> placeStockOrder(@RequestBody Stock stock){
		String message = consumer.createStock(stock).getBody();
		return ResponseEntity.ok(message);
	}

}
