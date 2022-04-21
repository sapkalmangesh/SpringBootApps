package com.mauli.ms.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.mauli.ms.bean.Employee;

@Component
public class TestEmpRunner implements CommandLineRunner {
	@Autowired
	private Employee employee;

	@Override
	public void run(String... args) throws Exception {

		System.out.println(employee);
	}

}
