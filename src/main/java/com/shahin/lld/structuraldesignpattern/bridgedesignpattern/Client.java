package com.shahin.lld.structuraldesignpattern.bridgedesignpattern;

public class Client {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        Shape blueSquare = new Square(new BlueColor());

        redCircle.draw();     // Drawing Circle in color: Red
        blueSquare.draw();    // Drawing Square in color: Blue
    }
}
