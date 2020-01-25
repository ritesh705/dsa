package com.ritesh.ds.tree.deletetion;

import com.ritesh.ds.tree.core.Node;

import java.util.LinkedList;
import java.util.Queue;

public class Deletion
{
    public static void delete(Node root, int data)
    {
        Node dNode = null;
        Node tNode = null;
        Queue<Node> queue = new LinkedList();
        queue.add(root);
        while(!queue.isEmpty())
        {
            tNode = queue.poll();
            if(tNode.key == data)
            {
                dNode = tNode;
            }
            if(tNode.left != null)
            {
                queue.add(tNode.left);
            }
            if(tNode.right != null)
            {
                queue.add(tNode.right);
            }
        }
        dNode.key = tNode.key;
        deleteRightmostDeepestNode(root, tNode);
    }

    private static void deleteRightmostDeepestNode(Node root, Node rDNode)
    {
        Queue<Node> queue = new LinkedList();
        queue.add(root);

        while(!queue.isEmpty())
        {
            Node tNode = queue.poll();
            if(tNode.left != null)
            {
                if(tNode.left==rDNode)
                {
                    tNode.left = null;
                    rDNode = null;
                    return;
                }
                queue.add(tNode.left);
            }
            if(tNode.right != null)
            {
                if(tNode.right==rDNode)
                {
                    tNode.right = null;
                    rDNode = null;
                    return;
                }
                queue.add(tNode.right);
            }
        }
    }
}