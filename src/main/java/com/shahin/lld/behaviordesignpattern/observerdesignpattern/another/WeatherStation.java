package com.shahin.lld.behaviordesignpattern.observerdesignpattern.another;

// Concrete Observable

import java.util.ArrayList;
import java.util.List;

class WeatherStation implements Subject {

    private List<Observer> observers;

    private int temperature;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

}