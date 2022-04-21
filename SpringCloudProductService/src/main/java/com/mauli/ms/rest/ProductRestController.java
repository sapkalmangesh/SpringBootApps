package com.mauli.ms.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductRestController {
	public ResponseEntity<String> showMessage(){
		return ResponseEntity.ok("WELCOME TO PRODUCT SERVICE");
	}
	

}
