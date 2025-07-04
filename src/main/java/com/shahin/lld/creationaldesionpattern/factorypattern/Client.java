package com.shahin.lld.creationaldesionpattern.factorypattern;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();  // Output: Drawing a Circle

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();  // Output: Drawing a Rectangle

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();  // Output: Drawing a Square
    }
}
