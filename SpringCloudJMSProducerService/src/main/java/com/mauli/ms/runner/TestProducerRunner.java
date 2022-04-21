package com.mauli.ms.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.mauli.ms.service.ProducerService;

public class TestProducerRunner implements CommandLineRunner {
	@Autowired
	private ProducerService service;

	public void run(String... args) throws Exception {
		service.sendMessage("Hello Everyone "+new Date());
		System.out.println("message send succesfully");
	}

}
