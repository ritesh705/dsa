package com.ritesh.ds.arrays;

public class Reverse
{
    public static int[] reverse01(int[] array)
    {
        int[] reverseArray = new int[array.length];
        int j = 0;
        for(int i = array.length-1; i>=0; i--)
        {
            reverseArray[j] = array[i];
            System.out.print(array[i]);
            j++;
        }
        return reverseArray;
    }

    public static int[] reverse02(int[] array)
    {
        int low = 0;
        int high = array.length-1;
        while(low<high)
        {
            swap(array, low, high);
            low++;
            high--;
        }
        return array;
    }

    private static void swap(int[] array, int low, int high)
    {
        array[low] = array[low] + array[high];
        array[high] = array[low] - array[high];
        array[low]  = array[low] - array[high];
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int[] revArray = reverse02(arr);
        for(int i = 0; i< revArray.length; i++)
        {
            System.out.print(revArray[i]);
        }
    }
}