package com.shahin.lld.dsa.linklist.doublelinklist;

public class DoubleLinkList {
    private Node head;

    // Insert a node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Insert a node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete a node by value
    public void deleteByValue(int data) {
        if (head == null) return;

        Node temp = head;

        // If the node to delete is the head
        if (temp.data == data) {
            head = temp.next;
            if (head != null) head.prev = null;
            return;
        }

        // Traverse to find the node to delete
        while (temp != null && temp.data != data) {
            temp = temp.next;
        }

        if (temp == null) return; // Value not found

        // Adjust the links
        if (temp.next != null)
            temp.next.prev = temp.prev;
        if (temp.prev != null)
            temp.prev.next = temp.next;
    }

    // Display the list forward
    public void displayForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Display the list backward
    public void displayBackward() {
        if (head == null) return;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

}
