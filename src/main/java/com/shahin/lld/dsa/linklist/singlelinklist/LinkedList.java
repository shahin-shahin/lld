package com.shahin.lld.dsa.linklist.singlelinklist;

public class LinkedList {

    private Node head;

    // Insert a new node at the end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Insert a node at the beginning
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }

    // Delete a node by value
    public void delete(int key) {
        if (head == null) return;

        // If the head node is to be deleted
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;

        // Search for the key
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // Key not found
        if (current == null) return;

        // Unlink the node
        prev.next = current.next;
    }

    // Search for a node
    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key)
                return true;
            current = current.next;
        }
        return false;
    }

    // Display all nodes
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Get the size of the linked list
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
