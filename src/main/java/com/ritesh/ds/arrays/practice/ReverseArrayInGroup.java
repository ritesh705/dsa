package com.ritesh.ds.arrays.practice;

import java.util.Arrays;

public class ReverseArrayInGroup
{
    public static void main(String[] args)
    {
        int[] ipArray = {1,2,3,4,5,6,7,8};
        Arrays.stream(reverseArrayInGroup(ipArray, 5)).forEach(n -> System.out.print(n+" "));
    }

    private static int[] reverseArrayInGroup(int[] ipArray, int K)
    {
        int[] resultArray = null;
        int length = 0;
        if(ipArray != null)
        {
            length = ipArray.length;
            resultArray = new int[ipArray.length];
        }
        int numberOfGrp = length/K;
        if(length%K > 0){
            numberOfGrp++;
        }
        int count = 1;
        int i = 0;
        while(count <= numberOfGrp)
        {
            int start = count*K-1;
            if(start >= length)
            {
                start = length-1;
            }
            int stop = (count-1)*K;
            for(int j = start; j>= stop; j--)
            {
                resultArray[j] = ipArray[i];
                i++;
            }
            count++;
        }
        return resultArray;
    }
}
