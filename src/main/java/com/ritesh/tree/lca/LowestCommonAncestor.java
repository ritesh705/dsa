package com.ritesh.tree.lca;

import com.ritesh.tree.core.Node;

public class LowestCommonAncestor
{
    public static Node findLCA(Node root, int n1, int n2)
    {
        if(root == null)
        {
            return null;
        }

        if(root.key == n1 || root.key == n2)
        {
            return root;
        }

        Node leftLCANode = findLCA(root.left, n1, n2);
        Node rightLCANode = findLCA(root.right, n1, n2);
        if(leftLCANode != null && rightLCANode != null)
        {
            return root;
        }
        return leftLCANode!=null?leftLCANode:rightLCANode;
    }
}
