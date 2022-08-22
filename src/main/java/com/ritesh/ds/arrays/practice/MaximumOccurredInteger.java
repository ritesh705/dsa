package com.ritesh.ds.arrays.practice;

/*
Given n ranges of the form L and R, the task is to find the maximum occurred integer in all the ranges.
If more than one such integer exists, print the smallest one.

0 <= Li, Ri < 1000000
* */
public class MaximumOccurredInteger
{
    public static void main(String[] args)
    {
        int[] L = { 1, 4, 9, 13, 21 };
        int[] R = { 15, 8, 12, 20, 30 };
        int maxOccurredInt = getMaxOccurredInteger(L, R);
        System.out.println(maxOccurredInt);
    }

    private static int getMaxOccurredInteger(int[] L, int[] R)
    {
        int result = -1;
        int[] trackArray = new int[1000000];
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

        for(int i=1; i< max+1; i++)
        {
            trackArray[i] = trackArray[i] + trackArray[i-1];
            if(trackArray[i] > trackArray[i-1])
            {
                result = i;
            }
        }
        return result;
    }
}
