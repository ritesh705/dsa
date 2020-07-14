package com.ritesh.ds.greedy;

import java.util.Arrays;

public class FractionalKnapsack
{
    private static int getMaxValue(Item[] items, int capacity)
    {
        int result = 0;
        Arrays.sort(items);
        int currentCapacity = capacity;

        for(Item o : items)
        {
            if(o!=null)
            {
                if(currentCapacity > o.getWeight())
                {
                    result = result+o.getValue();
                    currentCapacity = currentCapacity - o.getWeight();
                }
                else
                {
                    result = result+(o.getValue()/o.getWeight())*currentCapacity;
                    currentCapacity = 0;
                }
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        Item[] items = {new Item(10, 60),
                new Item(20, 100),
                new Item(30, 120)};

        int maxVal = getMaxValue(items, 50);
        System.out.println("Max Value: "+maxVal);
    }
}

class Item implements Comparable<Item>
{
    private int weight;
    private int value;

    Item(int weight, int value)
    {
        this.weight = weight;
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Item o)
    {
        int result = 0;
        int valuePerUnitWeight = this.value/this.weight;
        int inputValuePerUnitWeight = o.value/o.weight;
        if(inputValuePerUnitWeight > valuePerUnitWeight)
            result = -1;
        result = 1;
        return result;
    }
}