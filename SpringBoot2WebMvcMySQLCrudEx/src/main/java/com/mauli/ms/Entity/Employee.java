package com.mauli.ms.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="empTab")
public class Employee {
	@Id
	@Column(name="eid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	
	@Column(name="name")
	private String empName;
	
	@Column(name="gen")
	private String empGen;
	
	@Column(name="Dept.")
	private String empDept;
	
	@Column(name="sal")
	private Double empSal;
	
	@Column(name="addr")
	private String empAddr;

}
