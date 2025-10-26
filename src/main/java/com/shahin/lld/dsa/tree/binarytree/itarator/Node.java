package com.shahin.lld.dsa.tree.binarytree.itarator;

// Represents a single node in the BST
public class Node {
    int key;
    Node left, right;

    // Constructor
    public Node(int item) {
        key = item;
        left = right = null;
    }
}

