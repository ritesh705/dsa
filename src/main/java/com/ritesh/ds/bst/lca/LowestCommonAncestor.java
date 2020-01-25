package com.ritesh.ds.bst.lca;

import com.ritesh.ds.tree.core.Node;

/*
 * @author: Ritesh Kumar | ritesh705@gmail.com
 * @since: 29th December, 2019
 * */

public class LowestCommonAncestor
{
    public static Node findLCA(Node root, int n1, int n2)
    {
        Node lcaNode = null;
        if(root == null)
        {
            lcaNode = null;
        }
        else if(n1 > root.key && n2 > root.key)
        {
            lcaNode = findLCA(root.right, n1, n2);
        }
        else if(n1 < root.key && n2 < root.key)
        {
            lcaNode = findLCA(root.left, n1, n2);
        }
        else
        {
            lcaNode = root;
        }
        return lcaNode;
    }
}