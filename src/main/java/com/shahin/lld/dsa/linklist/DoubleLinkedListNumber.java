package com.shahin.lld.dsa.linklist;

import java.util.Stack;

public class DoubleLinkedListNumber {

    // Function to double the number represented by the linked list
    public ListNode doubleIt(ListNode head) {

        // Step 1️⃣: Use a stack to store all nodes (so we can start from the end)
        Stack<ListNode> stack = new Stack<>();
        ListNode current = head;

        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        // Step 2️⃣: We'll rebuild the number while doubling each digit
        int carry = 0;        // to handle numbers like 9 × 2 = 18
        ListNode nextNode = null;  // to rebuild the reversed list

        while (!stack.isEmpty()) {
            // Take the last node from the stack
            current = stack.pop();

            // Reconnect list backward
            current.next = nextNode;
            nextNode = current;

            // Double the digit and add carry
            int doubledValue = current.val * 2 + carry;

            // Update the node’s value to the last digit
            current.val = doubledValue % 10;

            // Update carry (if result >= 10)
            carry = doubledValue / 10;
        }

        // Step 3️⃣: If carry still exists, make a new head node
        if (carry > 0) {
            ListNode newHead = new ListNode(carry);
            newHead.next = nextNode;
            return newHead;
        }

        // Step 4️⃣: Return the new head of the updated list
        return nextNode;
    }

    // Helper function to print the list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Example test
    public static void main(String[] args) {
        DoubleLinkedListNumber obj = new DoubleLinkedListNumber();

        // Create a linked list: 1 → 9 → 9
        ListNode head = new ListNode(1);
        head.next = new ListNode(8);
        head.next.next = new ListNode(9);

        System.out.print("Original: ");
        obj.printList(head);

        // Double the list value
        head = obj.doubleIt(head);

        System.out.print("Doubled:  ");
        obj.printList(head);
    }
}

