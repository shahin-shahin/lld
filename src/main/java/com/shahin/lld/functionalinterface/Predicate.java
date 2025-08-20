package com.shahin.lld.functionalinterface;

@FunctionalInterface
public interface Predicate<T> {

    boolean test(T t);
}
