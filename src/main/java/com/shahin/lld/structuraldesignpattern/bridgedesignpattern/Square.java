package com.shahin.lld.structuraldesignpattern.bridgedesignpattern;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square in color: " + color.getColor());
    }
}