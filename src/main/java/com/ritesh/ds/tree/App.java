package com.ritesh.ds.tree;

import com.ritesh.ds.tree.core.Node;
import com.ritesh.ds.tree.core.Tree;
import com.ritesh.ds.tree.deletetion.Deletion;
import com.ritesh.ds.tree.diameter.Diameter;
import com.ritesh.ds.tree.insertion.Insertion;
import com.ritesh.ds.tree.lca.LowestCommonAncestor;
import com.ritesh.ds.tree.traversal.TreeTraversal;

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
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("PreOrder traversal of binary tree is ");
        TreeTraversal.preOrder(tree.root);

        System.out.println("InOrder traversal of binary tree is ");
        TreeTraversal.inOrder(tree.root);

        System.out.println("PostOrder traversal of binary tree is ");
        TreeTraversal.postOrder(tree.root);

        System.out.println("LevelOrder traversal of binary tree is ");
        TreeTraversal.levelOrder(tree.root);

        // Insertion
        Insertion.insert(tree.root, 8);
        Insertion.insert(tree.root, 9);

        System.out.println("LevelOrder traversal of binary tree is ");
        TreeTraversal.levelOrder(tree.root);

        // Deletion
        Deletion.delete(tree.root, 9);

        // Finding LCA
        System.out.println("LCA(2, 4) = " + LowestCommonAncestor.findLCA(tree.root, 2, 4).key);

        // Finding Diameter
        System.out.println("Diameter : "+ Diameter.getDiameter(tree.root));
    }
}