package com.ritesh.ds.arrays.practice;

public class MaximumOccurredInteger
{
    public static void main(String[] args)
    {
        int[] L = { 1, 4, 9};
        int[] R = { 15, 8, 12};
        int maxOccurredInt = getMaxOccurredInteger(L, R);
        System.out.println(maxOccurredInt);
    }

    private static int getMaxOccurredInteger(int[] L, int[] R)
    {
        int result = -1;
        int[] trackArray = new int[10000];
        int max = -1;
        for(int i=0; i<L.length; i++)
        {
            trackArray[L[i]] += 1;
            trackArray[R[i] + 1] -= 1;
            if(trackArray[R[i]] > max)
            {
                max = R[i];
            }
        }

        int prevSum = 0;
        int sum  = 0;
        for(int i=0; i< max+1; i++)
        {
            sum = sum + trackArray[i];
            if(sum > prevSum)
            {
                result = i;
            }
            prevSum = sum;
        }
        return result;
    }
}
