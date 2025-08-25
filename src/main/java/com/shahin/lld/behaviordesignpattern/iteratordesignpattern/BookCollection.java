package com.shahin.lld.behaviordesignpattern.iteratordesignpattern;

interface BookCollection {
    Iterator<Book> createIterator();
}