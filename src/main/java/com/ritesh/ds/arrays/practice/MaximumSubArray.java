package com.ritesh.ds.arrays.practice;

public class MaximumSubArray
{
    public static void main(String[] args)
    {
        int[] ipArr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(ipArr));
    }

    private static int maxSubArray(int[] ipArray)
    {
        int sum = Integer.MIN_VALUE;
        int continuesSum = 0;
        for(int i=0; i< ipArray.length; i++)
        {
            continuesSum = continuesSum + ipArray[i];
            if(sum<continuesSum)
            {
                sum = continuesSum;
            }
            if(continuesSum < 0)
            {
                continuesSum = 0;
            }
        }
        return sum;
    }
}
