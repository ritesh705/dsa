package com.ritesh.tree.insertion;

import com.ritesh.tree.core.Node;

import java.util.LinkedList;
import java.util.Queue;

public class Insertion
{
    public static void insert(Node root, int data)
    {
        Queue<Node> queue = new LinkedList();
        queue.add(root);
        while(!queue.isEmpty())
        {
            Node tempNode = queue.poll();
            if(tempNode.left == null) {
                tempNode.left = new Node(data);
                break;
            }
            else
                queue.add(tempNode.left);
            if(tempNode.right == null)
            {
                tempNode.right = new Node(data);
                break;
            }
            else
                queue.add(tempNode.right);
        }
    }
}
