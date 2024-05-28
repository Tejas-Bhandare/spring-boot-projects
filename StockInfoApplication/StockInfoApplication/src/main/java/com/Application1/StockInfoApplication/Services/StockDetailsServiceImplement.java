package com.Application1.StockInfoApplication.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Application1.StockInfoApplication.Entities.StockDetails;

import jakarta.annotation.PostConstruct;

@Service
public class StockDetailsServiceImplement implements StockDetailsService 
{
	List<StockDetails> stockDetailsList = new ArrayList<>();
	
	@PostConstruct
	public void init()
	{
		StockDetails stock1 = new StockDetails(111,"Kotak Bank",1800);
		StockDetails stock2 = new StockDetails(112,"IDFC FB",1400);
		StockDetails stock3 = new StockDetails(113,"CEAT ",180);
		
		stockDetailsList.add(stock1);
		stockDetailsList.add(stock2);
		stockDetailsList.add(stock3);
		System.out.println("INitialised Stock List "+ stockDetailsList );
	}
	
	@Override
	public List<StockDetails> getAllStocks()
	{
		return stockDetailsList;
	}
	@Override
	public StockDetails createStock(StockDetails stockDetail)
	{
		if(stockDetailsList.add(stockDetail))
		{
			return stockDetail;
		}
		return null;
	}

	@Override
	public StockDetails addStock(StockDetails newStock1) {
		// TODO Auto-generated method stub
		if(stockDetailsList.add(newStock1))
		{
			return newStock1;
		}
		return null;
	}

	@Override
	public StockDetails putStock(StockDetails putStock2) {
		// TODO Auto-generated method stub
		System.out.println(" Inside put method");
		
		int pos = 0;
		for(StockDetails Stock : stockDetailsList)
		{
			if(putStock2.getStockId() == Stock.getStockId())
			{
				stockDetailsList.set(pos, putStock2);
				System.out.println(" Stock is already exist");
				break;
			}
			pos++;
		}
		return null;
	}
	
	
	
	
	
}
