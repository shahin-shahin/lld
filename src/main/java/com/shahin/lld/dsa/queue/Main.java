package com.shahin.lld.dsa.queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        System.out.println("Front element is: " + queue.peek());

        queue.dequeue();
        queue.display();

        queue.delete();
        queue.display();
    }

}
