package com.ritesh.ds.arrays.practice;

/*
##### BEST TIME TO BUY AND SELL STOCK #####

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock
and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction.
If you cannot achieve any profit, return 0.
* */
public class StockBuyAndSellBestTime
{
    public static void main(String[] args)
    {
        int[] priceArr = new int[]{100, 180, 260, 310, 40, 535, 695 };
        System.out.println(getMaxProfit(priceArr));
    }

    private static int getMaxProfit(int[] priceArr)
    {
        int buyPrice = 0;
        int sellPrice = 0;
        int maxProfit = 0;
        for(int i=0; i< priceArr.length; i++)
        {
            if(i==0 && priceArr[i]<priceArr[i+1])
            {
                buyPrice = priceArr[i];
                sellPrice = 0;
            }
            else if(i==priceArr.length-1 && priceArr[i] > priceArr[i-1])
            {
                sellPrice = priceArr[i];
            }
            else if(priceArr[i] < priceArr[i-1] && priceArr[i] < priceArr[i+1])
            {
                buyPrice = priceArr[i];
                sellPrice = 0;
            }
            else if(priceArr[i] > priceArr[i-1] && priceArr[i] > priceArr[i+1])
            {
                sellPrice = priceArr[i];
            }
            if(buyPrice > 0 && sellPrice > buyPrice)
            {
                maxProfit = maxProfit + sellPrice-buyPrice;
            }
        }
        return maxProfit;
    }
}
