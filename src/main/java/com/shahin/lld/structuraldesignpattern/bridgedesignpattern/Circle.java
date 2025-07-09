package com.shahin.lld.structuraldesignpattern.bridgedesignpattern;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle in color: " + color.getColor());
    }
}
