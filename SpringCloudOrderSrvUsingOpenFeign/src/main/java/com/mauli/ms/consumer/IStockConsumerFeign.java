package com.mauli.ms.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mauli.ms.model.Stock;

@FeignClient("STOCK-SERVICE")
public interface IStockConsumerFeign {

	@GetMapping("stock/show")
	public ResponseEntity<String> showMessage();
	
	@GetMapping("stock/fing/{id}")
	public ResponseEntity<Stock> getOneStock(@PathVariable long id);
	
	@PostMapping("stock/creates")
	public ResponseEntity<String> createStock(@RequestBody Stock stock);
}
