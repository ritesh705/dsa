package com.ritesh.bst.insert;

import com.ritesh.tree.core.Node;

public class Insert
{
    public Node insertKey(Node root, Integer key)
    {
        Node newNode = root;
        if(key != null)
        {
            if(root == null)
            {
                newNode = new Node(key);
            }
            else if(root != null)
            {
                if(key > root.key)
                {
                    root.right = insertKey(root.right, key);
                }
                else
                {
                    root.left = insertKey(root.left, key);
                }
            }
        }
        return newNode;
    }
}
