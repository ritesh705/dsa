package com.ritesh.ds.bst.search;

import com.ritesh.ds.tree.core.Node;

public class Search
{
    public Node searchKey(Node root, int key)
    {
        Node result = null;
        if(root == null || root.key == key)
        {
            result = root;
        }
        else if(key>root.key)
        {
            result = searchKey(root.right, key);
        }
        else if(key<root.key)
        {
            result = searchKey(root.left, key);
        }
        return result;
    }
}