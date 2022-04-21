package com.mauli.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class ConnectionCon {
	
	@Value("${my.app.name}")
	private String name;
	
	@Value("${my.app.url}")
	private String url;
	
	@Value("${my.app.username}")
	private String username;
	
	@Value("${my.app.password}")
	private String pwd;

}
