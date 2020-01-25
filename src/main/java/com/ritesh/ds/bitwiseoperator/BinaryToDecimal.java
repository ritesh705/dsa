package com.ritesh.ds.bitwiseoperator;

import java.util.ArrayList;
import java.util.List;

public class BinaryToDecimal
{
    public long convertBinaryToDecimal(List<Integer> list)
    {
        long result = 0;
        for(Integer binary : list)
        {
            result = (result<<1) + binary;
        }
        return result;
    }

    public static void main(String[] args)
    {
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(binaryToDecimal.convertBinaryToDecimal(list));
    }
}
