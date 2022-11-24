package com.bbs.patterns.singleton;

public class SingletonSingleThread {

    private static SingletonSingleThread INSTANCE;

    private SingletonSingleThread() {
        // Do nothing
    }

    public static SingletonSingleThread getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonSingleThread();
        }

        return INSTANCE;
    }
}