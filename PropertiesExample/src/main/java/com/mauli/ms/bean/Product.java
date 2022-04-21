package com.mauli.ms.bean;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Component
@ConfigurationProperties(prefix = "my.app")
public class Product {
	private Integer id;
	private String code;
	private Double cost;
	
	//private List<String> models;
	//private Set<String> models;
	private String[] models;
	
	private Map<String,String> details;
	
	private Vendor vob;
}
