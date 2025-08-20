package com.shahin.lld.functionalinterface;
@FunctionalInterface
public interface Function<T,R> {

    R apply(T t);
}
