package com.mauli.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mauli.bean.ConnectionCon;
@Component
public class TestRunner implements CommandLineRunner{
	@Autowired
	private ConnectionCon connectionCon;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(connectionCon);


}
}