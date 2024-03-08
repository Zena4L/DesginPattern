package org.example.creational.singleton;

public class SingletonLazy {
    private static SingletonLazy lazyInstance;

    private SingletonLazy() {

    }

    public static SingletonLazy getLazyInstance() {
        if (lazyInstance == null) {
            lazyInstance = new SingletonLazy();
        }
        return lazyInstance;
    }
}
