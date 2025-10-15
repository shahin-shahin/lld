package com.shahin.lld.dsa.stack;

public class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    // Constructor
    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Utility methods
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack overflow");
            return;
        }

        arr[++top] = x;
        System.out.println("Successfully push");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        int value = arr[top--];
        System.out.println(value + " popped from stack");
        return value;
    }

    // Peek - get top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    // Delete - clear all elements
    public void delete() {
        top = -1; // simply reset top pointer
        System.out.println("Stack deleted");
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
