package com.shahin.lld.behaviordesignpattern.commanddesignpattern;

// 2. Receiver
class Light {
    void turnOn() {
        System.out.println("Light is ON");
    }

    void turnOff() {
        System.out.println("Light is OFF");
    }
}