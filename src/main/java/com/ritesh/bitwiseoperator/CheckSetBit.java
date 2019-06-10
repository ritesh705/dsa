package com.ritesh.bitwiseoperator;

public class CheckSetBit
{
    public static void main(String[] args)
    {
        int x = 5;
        int k = 2;
        boolean isBitSet = isBitSet(x, k);
        System.out.println("Is Kth Bit Set : "+isBitSet);

        Integer[] intArray = {2,2,3,3,3,4,4};
        int number = 2233344;
        System.out.println(number^number);
    }

    private static boolean isBitSet(int x, int k)
    {
        boolean isBitSet = false;
        // Generate a number whose kth bit se
        int genNumber = 1<<(k-1);
        // bitwise & of x and genNumber
        int newNumber = x & genNumber;
        if(newNumber!=0)
        {
            isBitSet = true;
            System.out.println(newNumber);
        }
        return isBitSet;
    }
}
