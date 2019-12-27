package com.ritesh.bst.traversal;

import com.ritesh.tree.core.Node;

public class Traversal
{
    public static void inorder(Node root)
    {
        if(root != null)
        {
            inorder(root.left);
            System.out.println(root.key+" ");
            inorder(root.right);
        }
    }
}
