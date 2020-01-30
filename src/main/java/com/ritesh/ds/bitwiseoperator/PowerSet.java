package com.ritesh.ds.bitwiseoperator;

public class PowerSet
{
    public static void generatePowerSet(String inputStr)
    {
        int length = inputStr.length();
        long powSetSize = (long)Math.pow(2, length);
        for(int i=0; i<powSetSize; i++)
        {
            for(int j=0; j<length; j++)
            {
                if((i&(1<<j))>0)
                {
                    System.out.print(inputStr.charAt(j));
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        generatePowerSet("ABC");
    }
}
