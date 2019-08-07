package com.ritesh.recursion;

public class Recursion
{
    private static int recursiveMethod(int n)
    {
        int result = 0;
        if(n < 1)
        {
            return result;
        }
        else
        {
            System.out.print(n);
            recursiveMethod(n-1);
            System.out.print(n);
        }
        return result;
    }

    public static void main(String[] args)
    {
        recursiveMethod(3);
    }
}