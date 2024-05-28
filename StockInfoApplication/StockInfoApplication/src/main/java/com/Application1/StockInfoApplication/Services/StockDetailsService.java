package com.Application1.StockInfoApplication.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.Application1.StockInfoApplication.Entities.StockDetails;

@Service
public interface StockDetailsService {
	
	List<StockDetails> getAllStocks();
	//StockDetails createStock();
	StockDetails createStock(StockDetails stockDetails);
	
	StockDetails addStock(StockDetails newStock1);
	StockDetails putStock(StockDetails putStock2);
	
}
