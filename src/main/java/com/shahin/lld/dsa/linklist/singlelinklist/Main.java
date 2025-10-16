package com.shahin.lld.dsa.linklist.singlelinklist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert nodes
        list.insert(10);
        list.insert(20);
        list.insert(30);

        // Insert at beginning
        list.insertAtBeginning(5);

        // Display the list
        System.out.println("Linked List:");
        list.display();

        // Delete a node
        list.delete(20);
        System.out.println("\nAfter deleting 20:");
        list.display();

        // Search for a value
        System.out.println("\nIs 30 in the list? " + list.search(30));
        System.out.println("Is 100 in the list? " + list.search(100));

        // Display size
        System.out.println("\nList size: " + list.size());
    }
}
