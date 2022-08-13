package com.ritesh.org.servicenow;

public class SearchSortedAndRotatedArray
{
    static int resultIndex = -1;

    public static void main(String[] args)
    {
        System.out.println(search(34));
    }

    private static int search(int searchValue)
    {
        int[] givenArray = {49, 59, 13, 23, 34, 45};
        int result = searchRotatedArray(givenArray, searchValue, 0, givenArray.length-1);
        return result;
    }

    private static int searchRotatedArray(int[] givenArray, int ip, int startingIndex, int lastIndex)
    {
        int length = lastIndex-startingIndex+1;
        int midIndex = (startingIndex+lastIndex)/2;
        int firstElement = givenArray[startingIndex];
        int middleElement = givenArray[midIndex];
        int lastElement = givenArray[lastIndex];
        if(startingIndex == 0 && lastIndex == 0)
        {
            resultIndex = -1;
        }
        else if(ip == firstElement)
        {
            resultIndex = startingIndex;
        }
        else if(ip == middleElement)
        {
            resultIndex = midIndex;
        }
        else if(ip == lastElement)
        {
            resultIndex = length-1;
        }
        else if((ip > middleElement && ip> lastElement)
                || (ip < middleElement && ip < lastElement))
        {
            int tempStartingIndex = startingIndex;
            int tempLastIndex = midIndex;
            searchRotatedArray(givenArray, ip, tempStartingIndex, tempLastIndex);
        }
        else if(ip > middleElement && ip < lastElement)
        {
            int tempStartingIndex = midIndex;
            int tempLastIndex = lastIndex;
            searchRotatedArray(givenArray, ip, tempStartingIndex, tempLastIndex);
        }
        return resultIndex;
    }
}
