package com.design.lld.creationaldesionpattern.singletondesignpattern;

public class Logger {
    // 1. Volatile ensures visibility and prevents reordering
    private static volatile Logger instance;

    // 2. Private constructor to prevent external instantiation
    private Logger() {
        System.out.println("Logger Initialized!");
    }

    // 3. Public method to provide access
    public static Logger getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (Logger.class) {
                if (instance == null) { // Second check (with locking)
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Example method
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}

