package com.mauli.ms.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mauli.ms.bean.Employee;
import com.mauli.ms.bean.Product;

@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private Product product;
	@Autowired
	private Employee employee;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(product);
		System.out.println(employee);

	}

}
