package com.ritesh.bst.delete;

import com.ritesh.tree.core.Node;

public class Delete
{
    public Node deleteKey(Node root, int key)
    {
        if(key > root.key)
        {
            root.right = deleteKey(root.right, key);
        }
        if(key < root.key)
        {
            root.left = deleteKey(root.left, key);
        }
        if(key == root.key)
        {
            // Case 1 : Node to be deleted is LEAF NODE
            if(root.left == null && root.right == null)
            {
                root = null;
            }
            // Case 2 : Node to be deleted is having ONE CHILD
            else if(root.left == null && root.right != null)
            {
                root = root.right;
            }
            else if(root.left != null && root.right == null)
            {
                root = root.left;
            }
            // Case 3 : Node to be deleted is having BOTH CHILDREN
            else if(root.left != null && root.right != null)
            {
                Node inorderSuccessor = getInorderSuccessor(root);
                root.key = inorderSuccessor.key;
                root.right = deleteKey(root.right, inorderSuccessor.key);
            }
        }
        return root;
    }

    private Node getInorderSuccessor(Node root)
    {
        Node inorderSuccessor = root;
        if(root != null)
        {
            inorderSuccessor = findMinimumValueNode(root.right);
        }
        return inorderSuccessor;
    }

    private Node findMinimumValueNode(Node root)
    {
        Node minValueNode = root;
        if(root.left != null)
        {
            minValueNode = findMinimumValueNode(root.left);
        }
        return minValueNode;
    }
}
