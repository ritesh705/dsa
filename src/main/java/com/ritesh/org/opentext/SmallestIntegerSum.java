package com.ritesh.org.opentext;

public class SmallestIntegerSum
{
    /*
    Get the smallest integer whose sum of digits equal to given number
    * */
    public static void main(String[] args)
    {
        Runnable r1 = () -> {
            System.out.println("Smallest Integer: "
                    +getSmallestInteger(78));
        };
        Runnable r2 = () -> {
            System.out.println("Smallest Integer With Optimisation: "
                    +getSmallestNumberWithOptimisation(78));
        };
        new Thread(r1).start();
        new Thread(r2).start();
    }

    private static int getSmallestNumberWithOptimisation(int ipNumber)
    {
        int result = 0;
        /*
        10/9 = 1
        10%9 = 1
        {10%9+1 * 10^(10/9)} -1 = 2*10^1-1 = 19

        100/9 = 11
        100%9 = 1
        {100%9+1 * 10^(100/9)} -1 = 2*10^11-1
        */

        double tmpResult = (((ipNumber%9)+1)*Math.pow(10, (ipNumber/9)))-1;
        return (int)tmpResult;
    }

    private static int getSmallestInteger(int ipNumber)
    {
        int result = -1;
        int smallestDigit = ipNumber;
        while(true)
        {
            int sum = getSumOfDigits(smallestDigit);
            if (sum == ipNumber)
            {
                result = smallestDigit;
                break;
            }
            smallestDigit++;
        }
        return result;
    }

    private static int getSumOfDigits(int inputNumber)
    {
        int sum = 0;
        int dividend = inputNumber;
        while(dividend > 0)
        {
            int remainder = dividend%10;
            sum = sum + remainder;
            dividend = dividend/10;
        }
        return sum;
    }
}
