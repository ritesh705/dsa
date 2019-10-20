package com.ritesh.tree.core;

public class Node
{
    public Integer key;
    public Node left;
    public Node right;

    public Node(Integer val)
    {
        key = val;
        left = right = null;
    }
}
