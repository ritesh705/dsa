package com.ritesh.bst.search;

import com.ritesh.tree.core.Node;

public class Search
{
    public Node searchBST(Node root, int key)
    {
        Node result = null;
        if(root == null || root.key == key)
        {
            result = root;
        }
        else if(key>root.key)
        {
            result = searchBST(root.right, key);
        }
        else if(key<root.key)
        {
            result = searchBST(root.left, key);
        }
        return result;
    }
}