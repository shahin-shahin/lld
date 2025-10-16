package com.shahin.lld.dsa.linklist.doublelinklist;

public class Main {
    public static void main(String[] args) {
        DoubleLinkList list = new DoubleLinkList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtBeginning(5);
        list.insertAtBeginning(7);
        list.insertAtBeginning(3);

        list.displayForward();   // Output: Forward: 5 10 20 30
        list.displayBackward();  // Output: Backward: 30 20 10 5

        list.deleteByValue(20);
        list.displayForward();   // Output: Forward: 5 10 30
    }
}

