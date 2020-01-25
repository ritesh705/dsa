package com.ritesh.ds.stack;

public class TestStack
{
    public static void main(String[] args)
    {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        for(int i=0; i<6; i++)
        {
            System.out.println(stack.pop().getData());
        }
    }
}
