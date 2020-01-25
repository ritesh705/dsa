package com.ritesh.ds.tree.height;

import com.ritesh.ds.tree.core.Node;

public class Height
{
    public static Integer getHeight(Node root)
    {
        if(root == null)
            return 0;
        int lHeight = getHeight(root.left);
        int rHeight = getHeight(root.right);
        return 1+Math.max(lHeight, rHeight);
    }
}
