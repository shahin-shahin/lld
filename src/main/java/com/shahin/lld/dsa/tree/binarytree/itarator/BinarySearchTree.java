package com.shahin.lld.dsa.tree.binarytree.itarator;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    Node root;

    // Constructor
    public BinarySearchTree() {
        root = null;
    }

    // ===============================
    // 1. ITERATIVE INSERTION
    // ===============================
    public void insert(int key) {
        Node newNode = new Node(key);

        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent = null;

        while (current != null) {
            parent = current;
            if (key < current.key)
                current = current.left;
            else if (key > current.key)
                current = current.right;
            else
                return; // Ignore duplicates
        }

        if (key < parent.key)
            parent.left = newNode;
        else
            parent.right = newNode;
    }

    // ===============================
    // 2. ITERATIVE SEARCH
    // ===============================
    public boolean search(int key) {
        Node current = root;
        while (current != null) {
            if (key == current.key)
                return true;
            else if (key < current.key)
                current = current.left;
            else
                current = current.right;
        }
        return false;
    }

    // ===============================
    // 3. ITERATIVE DELETE
    // ===============================
    public void delete(int key) {
        root = deleteIter(root, key);
    }

    private Node deleteIter(Node root, int key) {
        Node parent = null;
        Node current = root;

        // Step 1: Find node to delete
        while (current != null && current.key != key) {
            parent = current;
            if (key < current.key)
                current = current.left;
            else
                current = current.right;
        }

        // Key not found
        if (current == null)
            return root;

        // Case 1: Node has no children
        if (current.left == null && current.right == null) {
            if (current == root)
                return null;
            if (parent.left == current)
                parent.left = null;
            else
                parent.right = null;
        }

        // Case 2: Node has one child
        else if (current.left == null || current.right == null) {
            Node child = (current.left != null) ? current.left : current.right;

            if (current == root)
                root = child;
            else if (parent.left == current)
                parent.left = child;
            else
                parent.right = child;
        }

        // Case 3: Node has two children
        else {
            Node successorParent = current;
            Node successor = current.right;

            while (successor.left != null) {
                successorParent = successor;
                successor = successor.left;
            }

            current.key = successor.key;

            if (successorParent.left == successor)
                successorParent.left = successor.right;
            else
                successorParent.right = successor.right;
        }

        return root;
    }

    // ===============================
    // 4. INORDER TRAVERSAL (LNR)
    // ===============================
    public void inorder() {
        System.out.print("Inorder: ");
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    // ===============================
    // 5. PREORDER TRAVERSAL (NLR)
    // ===============================
    public void preorder() {
        System.out.print("Preorder: ");
        preorderRec(root);
        System.out.println();
    }

    private void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // ===============================
    // 6. POSTORDER TRAVERSAL (LRN)
    // ===============================
    public void postorder() {
        System.out.print("Postorder: ");
        postorderRec(root);
        System.out.println();
    }

    private void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + " ");
        }
    }

    // ===============================
    // 7. LEVEL-ORDER TRAVERSAL (BFS)
    // ===============================
    public void levelOrder() {
        System.out.print("Level order: ");
        if (root == null) {
            System.out.println("(empty)");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.key + " ");

            if (current.left != null)
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);
        }
        System.out.println();
    }
}

