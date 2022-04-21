package com.mauli.ms.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {


	@GetMapping("/fetch")
	public ResponseEntity<String> fetchEmployee(){
		ResponseEntity<String> response = new ResponseEntity<String>(
				"Hello from fetch",
				HttpStatus.OK);
		return response;

	}

	@PostMapping("/save")
	public ResponseEntity<String> createEmployee(){
		ResponseEntity<String> response = new ResponseEntity(
				"HELLO FROM SAVE",
				HttpStatus.OK);
		return response;
	}

	@DeleteMapping("/remove")
	public ResponseEntity<String> deleteEmployee(){
		ResponseEntity<String> response = new ResponseEntity(
				"Hello form delete",
				HttpStatus.OK);
		return response;
	}
	
	@PatchMapping("/update")
	public ResponseEntity<String> emailUpdate(){
		ResponseEntity<String> response = new ResponseEntity(
				"hello, from emailUpadet",
				HttpStatus.OK);
		return response;

	}


}
