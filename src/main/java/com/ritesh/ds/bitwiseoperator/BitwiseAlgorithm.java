package com.ritesh.ds.bitwiseoperator;

public class BitwiseAlgorithm
{
    public static void main(String[] args)
    {
        int x = 5;
        int y = 4;
        int k = 2;
        bitwiseAnd(x, y);
        bitwiseOr(x, y);
        bitwiseComplement(x);
        bitwiseXor(x, y);
        bitwiseRightShift(x, k);
        bitwiseLeftShift(x, k);
        bitwiseUnsignedRightShift(x, k);
    }

    private static void bitwiseUnsignedRightShift(int x, int k)
    {
        int result = x>>>k;
        System.out.println("Bitwise >>>: "+result);
    }

    private static void bitwiseLeftShift(int x, int k)
    {
        int result = x<<k;
        System.out.println("Bitwise <<: "+result);
    }

    private static void bitwiseRightShift(int x, int k)
    {
        int result = x>>k;
        System.out.println("Bitwise >>: "+result);
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
