package com.shahin.lld.dsa.tree.binarytree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();


        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(80);


        // Insert nodes
//        tree.insert(50);
//        tree.insert(20);
//        tree.insert(30);
//        tree.insert(40);
//        tree.insert(70);
//        tree.insert(60);
//        tree.insert(80);

        System.out.println("Inorder traversal:");
        tree.inorder();
        tree.inorderIterative();

        System.out.println("Preorder traversal:");
        tree.preorder();

        System.out.println("Postorder traversal:");
        tree.postorder();

        // Search
        System.out.println("Search 40: " + tree.search(20));
        System.out.println("Search 90: " + tree.search(90));

        // Delete
        System.out.println("Deleting 20...");
        tree.delete(30);
        System.out.println("Inorder after deleting 20:");
//        tree.inorder();
    }
}

