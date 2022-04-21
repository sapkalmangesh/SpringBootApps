package com.mauli.ms.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mauli.ms.bean.Product;

@Component
public class TestProductRunner implements CommandLineRunner {

	@Autowired
	private Product product;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(product);
	}

}


