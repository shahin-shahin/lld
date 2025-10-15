package com.shahin.lld.dsa.queue;

public class Queue {

    private int[] arr;
    private int front;
    private int rear;
    private int capacity;


    // Constructor
    public Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
    }

    // Enqueue - insert element at the rear
    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        arr[++rear] = x;
        System.out.println(x + " added to queue");
    }

    // Dequeue - remove element from the front
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int value = arr[front++];
        System.out.println(value + " removed from queue");
        return value;
    }

    // Peek - view front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    // Delete - clear the entire queue
    public void delete() {
        front = 0;
        rear = -1;
        System.out.println("Queue deleted");
    }

    // Check if empty
    public boolean isEmpty() {
        return front > rear;
    }

    // Check if full
    public boolean isFull() {
        return rear == capacity - 1;
    }

    // Display queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
