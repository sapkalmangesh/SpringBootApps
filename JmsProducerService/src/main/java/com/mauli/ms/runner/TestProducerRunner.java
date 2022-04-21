package com.mauli.ms.runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.mauli.ms.service.ProducerService;


@Component
public class TestProducerRunner { //implements CommandLineRunner {

	@Autowired
	private ProducerService service;
	
	@Scheduled(fixedDelay = 5000) //mill sec
	public void run() throws Exception {
		service.sendMessage("Hello Everyone ==>" + new Date());
		System.out.println("SENT");
	}

}

