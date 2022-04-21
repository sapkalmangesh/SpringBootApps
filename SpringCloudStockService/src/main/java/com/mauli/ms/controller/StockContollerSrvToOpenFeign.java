package com.mauli.ms.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mauli.ms.model.Stock;
/***
 * This is producer #ms application
 * adding different method here
 * 
 * @author TBM
 *
 */

@RestController
@RequestMapping("/stock")
public class StockContollerSrvToOpenFeign {

	@Value("${server.port}")
	private String port;

	@GetMapping("/show")
	public ResponseEntity<String> showMessage(){
		return ResponseEntity.ok("WELCOME TO STOCK SERVICE PAGE " + port);
	}

	@GetMapping("/fing/{id}")
	public ResponseEntity<Stock> getOneStock(@PathVariable long id){
		return ResponseEntity.ok(new Stock(id,"TATA-154",150,350.50));

	}
	
	@PostMapping("/creates")
	public ResponseEntity<String> createStock(@RequestBody Stock stock){
		return ResponseEntity.ok(stock.toString());
	}



}
