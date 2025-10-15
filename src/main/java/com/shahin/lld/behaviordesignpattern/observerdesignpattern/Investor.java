package com.shahin.lld.behaviordesignpattern.observerdesignpattern;

public class Investor implements StockObserver {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double stockPrice) {
        System.out.println(name + " received an update for " + stockSymbol + ": $" + stockPrice);
    }
}