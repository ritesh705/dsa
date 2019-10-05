package com.ritesh.stack;

import com.ritesh.linkedlist.Node;

public class Stack
{
    Node top;

    public Stack()
    {
        top = null;
    }

    public void push(int val)
    {
        if(top == null)
        {
            top = new Node();
            top.setData(val);
        }
        else
        {
            Node oldTop = top;
            top = new Node();
            top.setData(val);
            top.setNext(oldTop);
        }
    }

    public Node pop()
    {
        Node result = null;
        if(top == null)
        {
            // throw StackUnderFlow Exception
            result = null;
        }
        else
        {
            Node newTop = top.getNext();
            top.setNext(null);
            result = top;
            top = newTop;
        }
        return result;
    }
}
