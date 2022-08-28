package com.ritesh.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
This class is for only testing small code snippet
* */
public class Test
{
    public static void main(String[] args)
    {
        List<Integer> testList = Collections.unmodifiableList(Arrays.asList(1, 2));
        System.out.println(testList.get(1));
    }
}
