package com.shahin.lld.behaviordesignpattern.observerdesignpattern;

public interface StockMarket {
    void registerObserver(StockObserver observer);
    void removeObserver(StockObserver observer);
    void notifyObservers(String stockSymbol, double stockPrice);
}