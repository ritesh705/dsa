package com.ritesh.linkedlist;

public class MiddleElement
{
    private static Integer getMiddleElement(LinkedList list)
    {
        if(list == null)
        {
            return null;
        }
        LinkedList.Node currentNode = list.head;
        LinkedList.Node middleNode = list.head;
        int length = 0;
        while(currentNode != null)
        {
            length++;
            currentNode = currentNode.next;
            if((length&1)==0)
            {
                middleNode=middleNode.next;
            }
        }
        return middleNode.data;
    }


    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(getMiddleElement(list));
    }
}
