package com.mphasis.main;

import com.mphasis.Portfolio;
import com.mphasis.entities.Stock;
import com.mphasis.services.StockService;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static
public class Main {
    //Portfolio portfolio;
    //StockService stockService;
    @InjectMocks
    Portfolio portfolio;
    @Mock
    StockService stockService;

    public static void main(String[] args){
        Main main =new Main();
        //main.setUp();
        System.out.println(main.testMarketValue());

    }
   /* public void setUp(){
        portfolio=new Portfolio();
        stockService=mock(StockService.class);
        portfolio.setStockService(stockService);
    }

    */
    @Test
    public boolean testMarketValue(){
        List<Stock>stocks=new ArrayList<Stock>();
        Stock googleStock=new Stock("1","Google",100);
        Stock msrStock=new Stock("2","MSR",50);
        stocks.add(googleStock);
        stocks.add(msrStock);

        portfolio.setStocks(stocks);
        when(stockService.getPrice(googleStock)).thenReturn(10000.0);
        when(stockService.getPrice(msrStock)).thenReturn(1000.0);
        double marketValue= portfolio.getMarketValue();
        //return marketValue==1050000;
        assertEquals
    }

}
