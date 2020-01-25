package com.ritesh.ds.linkedlist;

/*
* @author : Ritesh Kumar | ritesh705@gmail.com
* */
public class ReverseLinkedList
{
    public static LinkedList reverseLinkedList(LinkedList lList)
    {
        Node cNode = lList.head;
        Node pNode = null;
        Node nNode = null;
        while(cNode!=null)
        {
            if(pNode == null)
            {
                lList.tail = cNode;
            }
            if(cNode.next == null)
            {
                lList.head = cNode;
            }
            nNode = cNode.next;
            cNode.next = pNode;
            pNode = cNode;
            cNode = nNode;
        }
        return lList;
    }

    public static void main(String[] args)
    {
        LinkedList lList = new LinkedList();
        lList.add(1);
        lList.add(2);
        lList.add(3);
        lList.add(4);
        lList.add(5);
        lList.add(6);
        LinkedList list = reverseLinkedList(lList);
        Node cNode = null;
        if(list != null)
        {
            cNode = list.head;
        }
        while(cNode!=null)
        {
            System.out.println(cNode.data);
            cNode = cNode.next;
        }
    }
}
