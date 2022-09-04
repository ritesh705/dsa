package com.ritesh.ds.arrays.practice;

/*
##### MAXIMIZE PROFIT | BUY AND SELL STOCK #####
*/
public class StockBuyAndSellMaxProfit
{
    public static void main(String[] args)
    {
        int[] priceArr = new int[]{100, 180, 260, 310, 40, 535, 695};
        System.out.println(getMaxProfit(priceArr));
    }

    private static int getMaxProfit(int[] priceArr)
    {
        int buyPrice = 0;
        int sellPrice = 0;
        int maxProfit = 0;
        if(priceArr.length == 0)
        {
            return maxProfit;
        }
        for(int i=0; i< priceArr.length; i++)
        {
            if(i==0)
            {
                if(priceArr[i]<priceArr[i+1])
                {
                    buyPrice = priceArr[i];
                    sellPrice = 0;
                }
            }
            else if(i==priceArr.length-1)
            {
                if(priceArr[i] > priceArr[i-1])
                {
                    sellPrice = priceArr[i];
                }
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
                buyPrice =0;
                sellPrice =0;
            }
        }
        return maxProfit;
    }
}
