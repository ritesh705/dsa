package com.ritesh.ds.arrays.practice;

/*
##### BEST TIME TO BUY AND SELL STOCK #####

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock
and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction.
If you cannot achieve any profit, return 0.
*/
public class StockBuyAndSellBestTime
{
    public static void main(String[] args)
    {
        int[] priceArr01 = {100, 180, 260, 310, 40, 535, 695};
        int[] priceArr02 = {9,9,0,3,0,7,7,7,4,1,5,0,1,7};
        int[] priceArr03 = {4,11,2,7,1};
        int[] priceArr04 = {5,5,4,9,3,8,5,5,1,6,8,3,4};
        int[] priceArr05 = {7,2,5,3,8,1,9,4,11};
        System.out.println(getBestProfit(priceArr01));
        System.out.println(getBestProfit(priceArr02));
        System.out.println(getBestProfit(priceArr03));
        System.out.println(getBestProfit(priceArr04));
        System.out.println(getBestProfit(priceArr05));
    }

    private static int getBestProfit(int[] priceArr)
    {
        int bestProfit = 0;
        int prevBestProfit = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = 0;
        int maxIndex = 0;
        if(priceArr == null || priceArr.length == 0)
        {
            return bestProfit;
        }
        for(int i=0; i<priceArr.length; i++)
        {
            if(min > priceArr[i])
            {
                min = priceArr[i];
                minIndex = i;
                if(minIndex > maxIndex)
                {
                    max = Integer.MIN_VALUE;
                    if(bestProfit > prevBestProfit)
                    {
                        prevBestProfit = bestProfit;
                    }
                }
            }
            else if(minIndex < i && max < priceArr[i] && min < priceArr[i])
            {
                max = priceArr[i];
                maxIndex = i;
                bestProfit = max-min;
            }
        }
        if(prevBestProfit > bestProfit)
        {
            bestProfit = prevBestProfit;
        }
        return bestProfit;
    }
}
