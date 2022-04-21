package com.mauli.ms.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("STOCK-SERVICE")
public interface IStockConsumerFeign {
	
	@GetMapping("/stock/show")
	public ResponseEntity<String> showMessage();
}
