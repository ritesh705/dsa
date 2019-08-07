package com.ritesh.knapsack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Knapsack
{
    public static void main(String[] args)
    {
        Integer[] val = {60, 100, 120};
        Integer[] weight = {10, 20, 30};
        Integer W = 50;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(10,60);
        map.put(20,100);
        map.put(30,120);

        List<Integer> maxValList = new ArrayList<Integer>();

        for(Integer input : weight)
        {
            int n = W/input;
            int maxValue = 0;
            for(int i=0; i<n; i++)
            {
                maxValue = maxValue+map.get(input);
            }
            maxValList.add(maxValue);
            System.out.println(maxValue);
        }
    }
}
