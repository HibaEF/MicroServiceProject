package com.example.atelier2.Service;


import com.example.atelier2.Entity.Stock;
import com.example.atelier2.Repository.StockRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service

public class StockServiceImpl implements IStockService {

	@Autowired
	StockRepository stockRepository;


	@Override
	public List<Stock> retrieveAllStocks() {
		// récuperer la date à l'instant t1
		
		List<Stock> stocks = (List<Stock>) stockRepository.findAll();
	
		// récuperer la date à l'instant t2
		// temps execution = t2 - t1
		return stocks;
	}

	@Override
	public Stock addStock(Stock s) {
		// récuperer la date à l'instant t1
	
		return stockRepository.save(s);
		
	}

	@Override
	public void deleteStock(Long stockId) {
	
		stockRepository.deleteById(stockId);

	}

	@Override
	public Stock updateStock(Stock s) {
	
		return stockRepository.save(s);
	}

	@Override
	public Stock retrieveStock(Long stockId) {
		long start = System.currentTimeMillis();
	
		Stock stock = stockRepository.findById(stockId).orElse(null);
	
		 long elapsedTime = System.currentTimeMillis() - start;

		return stock;
	}

	@Override
	public String retrieveStatusStock() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String msgDate = sdf.format(now);
		String finalMessage = "";
		String newLine = System.getProperty("line.separator");
		List<Stock> stocksEnRouge = (List<Stock>) stockRepository.retrieveStatusStock();
	
		return finalMessage;
	}
	@Scheduled(cron = "* * 22 * * *")
	public String retreiveStockStatus() {
	
		return "";
	}
}