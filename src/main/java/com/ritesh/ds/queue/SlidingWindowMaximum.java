package com.ritesh.ds.queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/*
Description - Given an array and an integer k, find the maximum for each and every contiguous subarray of size k.
Input  :
arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, k = 3

Output :
3 3 4 5 5 5 6

@author :- Ritesh Kumar | ritesh705@gmail.com
*/
public class SlidingWindowMaximum
{

    private static List getSlidingWindowMax(int[] arr, int k)
    {
        List result = new ArrayList();
        Deque<Integer> deque = new LinkedList();
        for(int i=0; i<arr.length; i++)
        {
            while(deque.size() >= k)
            {
                deque.pollFirst();
            }

            while(!deque.isEmpty() && arr[i]>=arr[deque.peekLast()])
            {
                deque.pollLast();
            }
            deque.addLast(i);

            if(i>=k-1)
            {
                result.add(arr[deque.getFirst()]);
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6, 5, 3, 2};
        List<Integer> slidingWindowMax = getSlidingWindowMax(arr, 3);
        for(Integer val : slidingWindowMax)
        {
            System.out.println(val);
        }
    }

}