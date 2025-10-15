package com.shahin.lld.behaviordesignpattern.observerdesignpattern.another;

// Observable

interface Subject {

    void registerObserver(Observer o);

    void unregisterObserver(Observer o);

    void notifyObservers();

}