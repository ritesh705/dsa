package com.ritesh.tree.diameter;

import com.ritesh.tree.core.Node;
import com.ritesh.tree.height.Height;

public class Diameter
{
    public static Integer getDiameter(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int lDiameter = getDiameter(root.left);
        int rDiameter = getDiameter(root.right);
        int lHeight = Height.getHeight(root.left);
        int rHeight = Height.getHeight(root.right);
        return Math.max(Math.max(lDiameter, rDiameter),(1+lHeight+rHeight));
    }
}
