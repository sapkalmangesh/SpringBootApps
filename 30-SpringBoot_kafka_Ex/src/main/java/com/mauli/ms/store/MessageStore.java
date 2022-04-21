package com.mauli.ms.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mauli.ms.entity.StockQuote;
import com.mauli.ms.repo.StockQuoteRepository;

@Component
public class MessageStore {
	@Autowired
	private StockQuoteRepository repo;
	
	public void create(StockQuote quote) {
		repo.save(quote);
	}
	
	public List<StockQuote> fetchAll(){
		return repo.findAll();
		
	}
}
