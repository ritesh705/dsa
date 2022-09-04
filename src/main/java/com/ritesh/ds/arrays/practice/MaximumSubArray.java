package com.ritesh.ds.arrays.practice;

/*
Given an integer array ipArray,
find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
* */
public class MaximumSubArray
{
    public static void main(String[] args)
    {
        int[] ipArr01 = {-2,1,-3,4,-1,2,1,-5,4};
        int[] ipArr02 = {-2,-1};
        int[] ipArr03 = {-1,-2};

        System.out.println(maxSubArray(ipArr01));
        System.out.println(maxSubArray(ipArr02));
        System.out.println(maxSubArray(ipArr03));
    }

    private static int maxSubArray(int[] ipArray)
    {
        int sum = Integer.MIN_VALUE;
        int continuesSum = 0;
        for(int i=0; i< ipArray.length; i++)
        {
            continuesSum = continuesSum + ipArray[i];
            if(sum < continuesSum)
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
