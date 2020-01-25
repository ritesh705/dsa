package com.ritesh.ds.arrays;

/*
Java program to find maximum amount of water that can be trapped within given set of bars.
*/

public class TrappingRainWater
{
    public static void main(String[] args)
    {
        int arr[] = new int[10];
        arr = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int waterStored = getWaterStored(arr);
        System.out.println(waterStored);
    }

    private static int getWaterStored(int[] arr)
    {
        int waterStored = 0;
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = arr[0];
        for(int i=1; i<n; i++)
        {
            left[i] = Math.max(left[i-1], arr[i]);
        }

        right[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--)
        {
            right[i] = Math.max(right[i+1], arr[i]);
        }

        for(int i=0; i<n; i++)
        {
            waterStored = waterStored+Math.min(left[i], right[i])-arr[i];
        }
        return waterStored;
    }
}