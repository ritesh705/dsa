package com.ritesh.ds.stack;

import com.ritesh.ds.linkedlist.Node;

/*
* @author : Ritesh Kumar | ritesh705@gmail.com
*
* Stack -> From LinkedList
* */
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
