package com.shahin.lld.dsa.stack;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element is: " + stack.peek());

        stack.pop();
        stack.display();

        stack.delete();
        stack.display();
    }
}
