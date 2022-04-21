package com.mauli.ms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stock {
	private Long Id;
	private String code;
	private Integer qty;
	private float cost;

}
