package com.ritesh.bitwiseoperator;

public class BitwiseAlgorithm
{
    public static void main(String[] args)
    {
        int x = 4;
        int y = 5;
        bitwiseAnd(x, y);
        bitwiseOr(x, y);
        bitwiseComplement(x);
        bitwiseXor(x, y);
    }

    private static void bitwiseXor(int x, int y)
    {
        int result = x^y;
        System.out.println("Bitwise ^: "+result);
    }

    private static void bitwiseComplement(int x)
    {
        int result = ~x;
        System.out.println("Bitwise ~: "+result);
    }

    private static void bitwiseOr(int x, int y)
    {
        int result = x|y;
        System.out.println("Bitwise |: "+result);
    }

    private static void bitwiseAnd(int x, int y)
    {
        int result = x&y;
        System.out.println("Bitwise &: "+result);
    }
}
