package com.mauli.ms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauli.ms.entity.StockQuote;

public interface StockQuoteRepository extends JpaRepository<StockQuote, Long> {

}
