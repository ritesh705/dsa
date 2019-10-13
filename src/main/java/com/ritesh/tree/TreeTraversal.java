package com.ritesh.tree;

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

    public static void main(String[] args)
    {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is ");
        preOrder(tree.root);

        System.out.println("Inorder traversal of binary tree is ");
        inOrder(tree.root);

        System.out.println("Postorder traversal of binary tree is ");
        postOrder(tree.root);
    }
}
