package com.ritesh.ds.arrays.practice;

/*
##### MAXIMIZE PROFIT | BUY AND SELL STOCK #####
*/
public class StockBuyAndSellMaxProfit
{
    public static void main(String[] args)
    {
        int[] priceArr = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(getMaxProfit(priceArr));
    }

    private static int getMaxProfit(int[] ipArr)
    {
        int buyPrice = 0;
        int sellPrice = 0;
        int maxProfit = 0;
        if(ipArr.length == 0)
        {
            return maxProfit;
        }
        for(int i=0; i< ipArr.length; i++)
        {
            if(i==0)
            {
                if(ipArr[i]<ipArr[i+1])
                {
                    buyPrice = ipArr[i];
                    sellPrice = 0;
                }
            }
            else if(i==ipArr.length-1)
            {
                if(ipArr[i] > ipArr[i-1])
                {
                    sellPrice = ipArr[i];
                }
            }
            else if(ipArr[i] < ipArr[i-1] && ipArr[i] < ipArr[i+1])
            {
                buyPrice = ipArr[i];
                sellPrice = 0;
            }
            else if(ipArr[i] > ipArr[i-1] && ipArr[i] > ipArr[i+1])
            {
                sellPrice = ipArr[i];
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
