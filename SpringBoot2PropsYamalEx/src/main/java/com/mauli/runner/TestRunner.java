package com.mauli.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mauli.bean.DBConnection;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private DBConnection con;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Conection details are: "+con);

	}

}
