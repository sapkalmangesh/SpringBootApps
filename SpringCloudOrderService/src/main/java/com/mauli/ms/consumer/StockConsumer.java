package com.mauli.ms.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class StockConsumer {
	
	//1. Autowired LoadBalancerClient
	@Autowired
	private LoadBalancerClient client;
	
	public String getDataFromStock() {
		//2. Go to eureka to get one ServiceInstance using one serviceID
		
		ServiceInstance si = client.choose("STOCK-SERVICE");
		
		//3.TO READ URL AND ADD PATH
		 String url = si.getUri() +"/stock/show";
		 
		 //4.Use RestTemplate
		 
		 RestTemplate rt = new RestTemplate();
		 
		 //5. Make a call and get a response
		 ResponseEntity<String> response = rt.getForEntity(url, String.class);
		 
		 //6. get a response
		
		return response.getBody();
	}

}
