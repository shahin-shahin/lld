package com.shahin.lld.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {

        try {
            method1();
        }catch (MyCustomException e){
            log.error("e: ", e);
        }

    }

    public static  void method1() throws MyCustomException {
        throw new MyCustomException("Issue handle");
    }
}
