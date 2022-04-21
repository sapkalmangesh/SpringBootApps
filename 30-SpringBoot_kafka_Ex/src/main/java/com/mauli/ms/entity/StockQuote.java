package com.mauli.ms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Stock_Quote")
public class StockQuote {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="stock_id")
	private Long id;
	
	@Column(name="stock_code")
	private String code;
	
	@Column(name="stock_uprice")
	private Double unitPrice;
	
	@Column(name="stock_dtetime")
	private Date dateTime;

}
