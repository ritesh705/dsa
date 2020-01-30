package com.ritesh.ds.bitwiseoperator;

public class OddOccurringElement
{
    // Java program to find the element occurring odd number of times
    public static int find(int[] arr)
    {
        int count = 0;
        int length = arr.length;
        for(int i=0; i<length; i++)
        {
            count = count^arr[i];
        }
        return count;
    }

    public static void main(String[] args)
    {
        System.out.println(find(new int[]{3,3,3,4,5,4,5}));
    }
}
