package com.mauli.ms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Data
@Entity
@Table(name = "product_tab")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pid")
	private Integer prodId;
	
	@Column(name="code")
	private String prodCode;
	
	@Column(name="vendor")
	private String vendor;
	
	@Column(name="cost")
	private Double prodCost;

}
