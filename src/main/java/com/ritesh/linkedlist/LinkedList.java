package com.ritesh.linkedlist;

/*
* @author - Ritesh Kumar | ritesh705@gmail.com
*
* Linked List Implementation
* */
public class LinkedList
{
    Node head;
    Node tail;

    public LinkedList()
    {
        head = null;
        tail = null;
    }

    public void add(int data)
    {
        Node currentNode = new Node();
        currentNode.setData(data);
        currentNode.setNext(null);
        if(head==null)
        {
            head = currentNode;
            tail = currentNode;
        }
        else
        {
            tail = currentNode;
        }
    }

    class Node
    {
        int data;
        Node next;

        public int getData()
        {
            return data;
        }

        public void setData(int data)
        {
            this.data = data;
        }

        public Node getNext()
        {
            return next;
        }

        public void setNext(Node next)
        {
            this.next = next;
        }
    }
}
