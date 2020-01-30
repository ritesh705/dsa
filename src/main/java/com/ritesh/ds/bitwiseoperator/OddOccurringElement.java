package com.ritesh.ds.bitwiseoperator;

/*
@author : Ritesh Kumar | ritesh705@gmail.com

Description:
Java program to find the element occurring odd number of times
*/
public class OddOccurringElement
{
    public static int find(int[] arr)
    {
        int result = 0;
        int length = arr.length;
        for(int i=0; i<length; i++)
        {
            result = result^arr[i];
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(find(new int[]{3,3,3,4,5,4,5,6,6}));
    }
}
