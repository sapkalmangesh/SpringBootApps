package com.mauli.ms.util;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mauli.ms.entity.StockQuote;

@Component
public class JsonUtil {

	public String toJson(StockQuote quote) {
		try {
			return new ObjectMapper().writeValueAsString(quote);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;

	}

	public StockQuote fromJson(String Json) {
		try {
			new ObjectMapper().readValue(Json,StockQuote.class);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;

	}

}
