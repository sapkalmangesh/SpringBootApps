package com.mauli.ms.bean;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ConfigurationProperties(prefix="com.ms")
@Setter
@ToString

public class Employee {
	private Integer empId;
	private String empName;
	private Double empSal;
	
	private List<String> models; 
	private Map<String,String> details;
	private Department dept;
	
	
	
}



