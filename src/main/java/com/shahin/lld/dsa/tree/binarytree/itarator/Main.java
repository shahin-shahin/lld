package com.shahin.lld.dsa.tree.binarytree.itarator;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert nodes
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        // Display traversals
        bst.inorder();     // Sorted order
        bst.preorder();    // Root-first order
        bst.postorder();   // Root-last order
        bst.levelOrder();  // Breadth-first order

        // Search tests
        System.out.println("Search 40: " + bst.search(40));
        System.out.println("Search 90: " + bst.search(90));

        // Delete test
        System.out.println("\nDeleting 20 (leaf)...");
        bst.delete(20);
        bst.inorder();

        System.out.println("Deleting 30 (one child)...");
        bst.delete(30);
        bst.inorder();

        System.out.println("Deleting 50 (two children)...");
        bst.delete(50);
        bst.inorder();

        bst.levelOrder();
    }
}

