package com.mauli.ms.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="product.in")
public class Product {
	
	private Integer pId;
	private String pName;
	private Double pCost;
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Double getpCost() {
		return pCost;
	}
	public void setpCost(Double pCost) {
		this.pCost = pCost;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pCost=" + pCost + "]";
	}
	
	

}
