package com.Application1.StockInfoApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Application1.StockInfoApplication.Entities.StockDetails;
import com.Application1.StockInfoApplication.Services.StockDetailsService;

@RestController
@RequestMapping("/stock")
public class StockDetailsController 
{
	@Autowired
	private StockDetailsService stockDetailsService;
	
	@GetMapping("/getAllStocks")
	public List<StockDetails> getAllStocks()
	{
		return stockDetailsService.getAllStocks();
	}
	
	@PostMapping("/createStock")
	public StockDetails createStock(@RequestBody StockDetails stockDetail)
	{
		return stockDetailsService.createStock(stockDetail);
		
	}
	 
	@PostMapping("/addStock")
	public StockDetails addStock(@RequestBody StockDetails newStock)
	{
		return stockDetailsService.addStock(newStock);
	}
	
	@PutMapping("/putStock")
	public StockDetails putStock(@RequestBody StockDetails putStock1)
	{
		return stockDetailsService.putStock(putStock1);
	}
	
	
}
