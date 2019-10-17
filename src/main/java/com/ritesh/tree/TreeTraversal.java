package com.ritesh.tree;

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
        Queue<Node> queue = new LinkedList();
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

    public static void main(String[] args)
    {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("PreOrder traversal of binary tree is ");
        preOrder(tree.root);

        System.out.println("InOrder traversal of binary tree is ");
        inOrder(tree.root);

        System.out.println("PostOrder traversal of binary tree is ");
        postOrder(tree.root);

        System.out.println("LevelOrder traversal of binary tree is ");
        levelOrder(tree.root);
    }
}