package com.shahin.lld.behaviordesignpattern.observerdesignpattern;

public interface StockObserver {
    void update(String stockSymbol, double stockPrice);
}
