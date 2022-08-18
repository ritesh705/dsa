package com.ritesh.org.opentext;

import java.util.HashMap;
import java.util.Map;

/*
Print all pairs in an unsorted array with equal sum
*/
public class AllPairsWithEqualSum
{
    public static void main(String[] args) {
        int[] ipArray = {6, 4, 12, 10, 22, 54, 32, 42, 21, 11};
        printAllPairsWithEqualSum(ipArray);
    }
    private static void printAllPairsWithEqualSum(int[] ipArray)
    {
        Map<Integer, Integer> sumMap = new HashMap<>();
        int count = 0;
        for(int i=0; i<ipArray.length; i++)
        {
            for(int j=i+1; j<ipArray.length; j++)
            {
                int sum = ipArray[i] + ipArray[j];
                Integer element = sumMap.get(sum);
                if(element != null)
                {
                    count++;
                    System.out.println("--------------------"+count+"--------------------");
                    System.out.println("1st : "+ipArray[i]+" , "+ipArray[j]);
                    System.out.println("2nd : "+element+" , "+(sum-element));
                }
                else
                {
                    sumMap.put(sum, ipArray[i]);
                }
            }
        }
    }
}
