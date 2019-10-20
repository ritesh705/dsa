package com.ritesh.tree;

import com.ritesh.tree.core.Node;
import com.ritesh.tree.core.Tree;
import com.ritesh.tree.deletetion.Deletion;
import com.ritesh.tree.insertion.Insertion;
import com.ritesh.tree.traversal.TreeTraversal;

public class App
{
    public static void main(String[] args)
    {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("PreOrder traversal of binary tree is ");
        TreeTraversal.preOrder(tree.root);

        System.out.println("InOrder traversal of binary tree is ");
        TreeTraversal.inOrder(tree.root);

        System.out.println("PostOrder traversal of binary tree is ");
        TreeTraversal.postOrder(tree.root);

        System.out.println("LevelOrder traversal of binary tree is ");
        TreeTraversal.levelOrder(tree.root);

        Insertion.insert(tree.root, 6);
        Insertion.insert(tree.root, 7);

        System.out.println("LevelOrder traversal of binary tree is ");
        TreeTraversal.levelOrder(tree.root);

        Deletion.delete(tree.root, 6);
        System.out.println("LevelOrder traversal of binary tree is ");
        TreeTraversal.levelOrder(tree.root);
    }
}
