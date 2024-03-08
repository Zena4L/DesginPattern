package org.example.creational.singleton;

public class SingletonLazyTest {
    public static void main(String[] args) {
        SingletonLazy instance1 = SingletonLazy.getLazyInstance();
        SingletonLazy instance2 = SingletonLazy.getLazyInstance();

        System.out.println(instance1);
        System.out.println(instance2);
    }
}
