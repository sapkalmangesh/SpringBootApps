package com.mauli.ms.entity;

import java.util.List;
import java.util.Set;

import lombok.Data;

@Data
public class Employee {
	private Integer empId;
	private String empName;
	private Double empSal;
	private String empGen;
	private String empPwd;
	private String empAddr;
	private String empDept;
	private Set<String> empProj;
	private List<String>empClients;

}
