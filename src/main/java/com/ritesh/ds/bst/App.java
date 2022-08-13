package com.ritesh.ds.bst;

import com.ritesh.ds.bst.delete.Delete;
import com.ritesh.ds.bst.insert.Insert;
import com.ritesh.ds.bst.lca.LowestCommonAncestor;
import com.ritesh.ds.bst.search.Search;
import com.ritesh.ds.bst.traversal.Traversal;
import com.ritesh.ds.tree.core.Node;
import com.ritesh.ds.tree.core.Tree;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;

/*
* @author: Ritesh Kumar | ritesh705@gmail.com
* @since: 14th December, 2019
*
* Main class for Binary Search Tree
*
* */
public class App
{
    public static void main(String... args)
    {
        /*
                100
                / \
              20   500
             /  \
           10   30
                 \
                 40
        */
        Tree bst = new Tree();
        bst.root = new Node(100);
        bst.root.left = new Node(20);
        bst.root.left.left = new Node(10);
        bst.root.left.right = new Node(30);
        bst.root.left.right.right = new Node(40);
        bst.root.right = new Node(500);

        // Insert Key - Operation
        Insert insert = new Insert();
        System.out.println(insert.insertKey(bst.root, 50));

        // Search Key - Operation
        Search search = new Search();
        Node result = search.searchKey(bst.root, 50);
        if(result != null)
        {
            System.out.println("Match Found : "+result.key);
        }
        else
        {
            System.out.println("No Match Found");
        }

        //Delete Key - Operation
        Delete delete = new Delete();
        System.out.println("Before");
        
        Traversal.inorder(bst.root);
        Node updatedTree = delete.deleteKey(bst.root, 20);
        System.out.println("After");
        Traversal.inorder(updatedTree);

        //LCA
        System.out.println("Lowest Common Ancestor:");
        System.out.println(LowestCommonAncestor.findLCA(bst.root, 40, 500).key);
    }
}