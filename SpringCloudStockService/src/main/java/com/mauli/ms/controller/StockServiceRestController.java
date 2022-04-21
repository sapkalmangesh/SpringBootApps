package com.mauli.ms.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/stock")
public class StockServiceRestController {
	
	@Value("${server.port}")
	private String port;
	
		@GetMapping("/show")
		public ResponseEntity<String> showMessage(){
			return ResponseEntity.ok("WELCOME TO STOCK SERVICE PAGE " + port);
		
	}
}
