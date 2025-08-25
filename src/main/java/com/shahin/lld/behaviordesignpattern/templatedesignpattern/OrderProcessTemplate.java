package com.shahin.lld.behaviordesignpattern.templatedesignpattern;

public abstract class OrderProcessTemplate {

    protected abstract void selectItems();
    protected abstract void makePayment();
    protected abstract void deliver();

    // Template method defining the workflow
    public final void processOrder() {
        selectItems();
        makePayment();
        deliver();
    }

//    UML diagram
//    Client -> AbstractClass (template) -> ConcreteClass1
//                                        -> ConcreteClass2


}
