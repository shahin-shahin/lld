package com.shahin.lld.structuraldesignpattern.bridgedesignpattern;

public abstract class Shape {
    protected Color color;  // bridge to implementation

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
