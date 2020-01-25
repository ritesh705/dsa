package com.ritesh.ds.tree.traversal;

import com.ritesh.ds.tree.core.Node;

import java.util.LinkedList;
import java.util.Queue;

/*
* @author : Ritesh Kumar | ritesh705@gmail.com
*
* */

public class TreeTraversal
{
    // LDR
    public static void inOrder(Node node)
    {
        if(node==null)
            return;
        inOrder(node.left);
        System.out.println(node.key);
        inOrder(node.right);
    }

    // DLR
    public static void preOrder(Node node)
    {
        if(node==null)
            return;
        System.out.println(node.key);
        preOrder(node.left);
        preOrder(node.right);
    }

    // LRD
    public static void postOrder(Node node)
    {
        if(node==null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.key);
    }

    // Level Order Traversal
    public static void levelOrder(Node node)
    {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty())
        {
            Node tempNode = queue.poll();
            System.out.println(tempNode.key);
            if(tempNode.left != null)
            {
                queue.add(tempNode.left);
            }
            if(tempNode.right != null)
            {
                queue.add(tempNode.right);
            }
        }
    }
}