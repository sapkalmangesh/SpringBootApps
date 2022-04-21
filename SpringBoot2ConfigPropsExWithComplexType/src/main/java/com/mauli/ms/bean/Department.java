package com.mauli.ms.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Department {
	
	private Integer deptId;
	private String deptName;
	

}
