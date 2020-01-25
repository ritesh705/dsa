package com.ritesh.ds.recursion;

public class Recursion
{
    private static void recursiveMethod(int n)
    {
        if(n>=1)
        {
            System.out.print(n);
            recursiveMethod(n-1);
            System.out.print(n);
        }
    }

    public static void main(String[] args)
    {
        recursiveMethod(3);
    }
}