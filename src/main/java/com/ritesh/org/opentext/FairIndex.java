package com.ritesh.org.opentext;

public class FairIndex
{
    public static void main(String[] args)
    {
        System.out.println("Result: "+getFairIndex());
    }

    private static int getFairIndex()
    {

        int[] A = {0, 4, -1, 0, 3};
        int[] B = {0, -2, 5, 0, 3};

        int fairIndex = 0;
        int sumOfArrayA = 0;
        int sumOfArrayB = 0;

        for (int i = 0; i < A.length; i++)
        {
            sumOfArrayA += A[i];
            sumOfArrayB += B[i];
        }

        int tempSumForArrayA = A[0];
        int tempSumForArrayB = B[0];

        for (int i = 1; i < A.length; i++)
        {
            if (i != 1
                    && tempSumForArrayA == tempSumForArrayB
                    && 2 * tempSumForArrayA == sumOfArrayA
                    && 2 * tempSumForArrayB == sumOfArrayB)
            {
                fairIndex++;
            }
            tempSumForArrayA += A[i];
            tempSumForArrayB += B[i];
        }
        return fairIndex;
    }
}
