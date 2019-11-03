package com.ritesh.arrays;

import java.util.ArrayList;
import java.util.List;

/*
* @author :- Ritesh Kumar
*
* Program -> Buy & Sell Stock, Using local minima and maxima
*/

public class StockBuyAndSell
{
    static class Stock
    {
        Integer buyDay;
        Integer sellDay;

        public int getBuyDay() {
            return buyDay;
        }

        public void setBuyDay(int buyDay) {
            this.buyDay = buyDay;
        }

        public int getSellDay() {
            return sellDay;
        }

        public void setSellDay(int sellDay) {
            this.sellDay = sellDay;
        }
    }

    private static List<Stock> getBuyAndSellPrices(int[] prices)
    {
        int n = prices.length;
        List<Stock> stocks = new ArrayList<>();
        Stock stock = null;
        for(int i=0; i<n; i++)
        {
            if(stock == null)
            {
                stock = new Stock();
            }

            Integer buyDay = getBuyDay(prices, n, i);
            if(buyDay != null)
            {
                stock.buyDay = buyDay;
            }

            Integer sellDay = getSellDay(prices, n, i);
            if(sellDay != null)
            {
                stock.sellDay = sellDay;
            }

            if(stock!=null && stock.buyDay!=null && stock.sellDay!=null)
            {
                stocks.add(stock);
                stock = new Stock();
            }
        }
        return stocks;
    }

    private static Integer getSellDay(int[] prices, int n, int i)
    {
        Integer sellDay = null;
        if(i==0 && prices[i]>prices[i+1] ||
                i==n-1 && prices[i]>prices[i-1] ||
                i > 0 && i < n-1 && prices[i]>prices[i-1] && prices[i]>prices[i+1])
        {
            sellDay = i;
        }
        return sellDay;
    }

    private static Integer getBuyDay(int[] prices, int n, int i)
    {
        Integer buyDay = null;
        if(i==0 && prices[i]<prices[i+1] ||
                i==n-1 && prices[i]<prices[i-1] ||
                i > 0 && i < n-1 && prices[i]<prices[i-1] && prices[i]<prices[i+1])
        {
            buyDay =i;
        }
        return buyDay;
    }

    // Run | Program
    public static void main(String[] args)
    {
        List<Stock> stocks = getBuyAndSellPrices(new int[]{100, 180, 260, 310, 40, 535, 695 });
        for(Stock stock : stocks)
        {
            System.out.println("Buy @ Day "+stock.getBuyDay()+" | Sell @ Day "+stock.getSellDay());
        }
    }
}