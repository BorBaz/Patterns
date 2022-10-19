package com.bbs.patterns.singleton;

public class SingletonThreadSafe {

    private static volatile SingletonThreadSafe INSTANCE;

    private SingletonThreadSafe() {
        // Do nothing
    }

    public static SingletonThreadSafe getInstance() {

        // It may seem that having the `result` variable here is completely
        // pointless.
        // There is, however, a very important caveat when
        // implementing double-checked locking in Java, which is solved by
        // introducing this local variable.
        SingletonThreadSafe result = INSTANCE;

        if (result != null) {
            return result;
        }


        if (INSTANCE == null) {
            synchronized (SingletonThreadSafe.class) {
                INSTANCE = new SingletonThreadSafe();
            }
        }

        return INSTANCE;
    }
}
