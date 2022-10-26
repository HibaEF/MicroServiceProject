package com.example.atelier2.Service;


import com.example.atelier2.Entity.Stock;

import java.util.List;

public interface IStockService {

	List<Stock> retrieveAllStocks();

	Stock addStock(Stock s);

	void deleteStock(Long id);

	Stock updateStock(Stock u);

	Stock retrieveStock(Long id);

	String retrieveStatusStock();
}
