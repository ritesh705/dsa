package com.ritesh.ds.linkedlist;

public class MiddleElement
{
    private static Integer getMiddleElement(LinkedList list)
    {
        if(list == null)
        {
            return null;
        }
        Node currentNode = list.head;
        Node middleNode = list.head;
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

    private static Integer getMiddleElementUsingFastPointer(LinkedList list)
    {
        Integer result = 0;
        if(list != null)
        {
            Node pointer = list.head;
            Node fastPointer = list.head;
            while(pointer.next != null
                    && fastPointer.next != null
                    && fastPointer.next.next != null)
            {
                pointer = pointer.next;
                fastPointer = fastPointer.next.next;
            }
            result = pointer.data;
        }
        return result;
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
        System.out.println(getMiddleElementUsingFastPointer(list));
    }
}
