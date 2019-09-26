package com.ritesh.arrays;

import java.util.ArrayList;
import java.util.List;
/*
* @author - Ritesh Kumar
*
* Stock buy and sell program
* */
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
    public static void main(String[] args)
    {
        List<Stock> stocks = getBuyAndSellPrices(new int[]{100, 180, 260, 310, 40, 535, 695 });
        for(Stock stock : stocks)
        {
            System.out.println("Buy @ Day "+stock.getBuyDay()+" | Sell @ Day "+stock.getSellDay());
        }
    }

    private static List<Stock> getBuyAndSellPrices(int[] prices)
    {
        int n = prices.length;
        // Idea is to get local maxima and minima
        List<Stock> stocks = new ArrayList<>();
        Stock stock = null;
        for(int i=0; i<n; i++)
        {
            if(stock == null)
            {
                stock = new Stock();
            }
            if(i==0 && prices[i]<prices[i+1])
            {
                stock.buyDay =i;
            }
            else if(i==n-1 && prices[i]<prices[i-1])
            {
                stock.buyDay =i;
            }
            else if(i > 0 && i < n-1 && prices[i]<prices[i-1] && prices[i]<prices[i+1])
            {
                stock.buyDay = i;
            }

            if(i==0 && prices[i]>prices[i+1])
            {
                stock.sellDay = i;
            }
            else if(i==n-1 && prices[i]>prices[i-1])
            {
                stock.sellDay = i;
            }
            else if(i > 0 && i < n-1 && prices[i]>prices[i-1] && prices[i]>prices[i+1])
            {
                stock.sellDay = i;
            }
            if(stock!=null && stock.buyDay!=null && stock.sellDay!=null)
            {
                stocks.add(stock);
                stock = new Stock();
            }
        }
        return stocks;
    }
}
