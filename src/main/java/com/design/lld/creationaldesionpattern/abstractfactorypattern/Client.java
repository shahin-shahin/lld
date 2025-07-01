package com.design.lld.creationaldesionpattern.abstractfactorypattern;

public class Client {
    public static void main(String[] args) {
        FurnitureFactory factory;

        // We want Modern furniture
        factory = new ModernFurnitureFactory();
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();

        chair.sitOn();  // Output: Sitting on a modern chair.
        sofa.lieOn();   // Output: Lying on a modern sofa.

        // We want Victorian furniture
        factory = new VictorianFurnitureFactory();
        chair = factory.createChair();
        sofa = factory.createSofa();

        chair.sitOn();  // Output: Sitting on a victorian chair.
        sofa.lieOn();   // Output: Lying on a victorian sofa.
    }
}
