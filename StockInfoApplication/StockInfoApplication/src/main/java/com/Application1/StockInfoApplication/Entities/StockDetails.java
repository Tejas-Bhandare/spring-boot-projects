package com.Application1.StockInfoApplication.Entities;

import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonAutoDetect(fieldVisibility = Visibility.ANY)

public class StockDetails {
	
	private int stockId;
	private String stockName;
	private float currentPrice;
	public StockDetails(int stockId, String stockName, float currentPrice) {
		super();
		this.setStockId(stockId);
		this.stockName = stockName;
		this.currentPrice = currentPrice;
	}
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	
}
