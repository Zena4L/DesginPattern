package org.example.creational.prototype;

public class Client {
    public static void main(String[] args) {
        Vechicle c1 = new Car(4, 30000, "red");
        Vechicle c2 = c1.clone();

        c2.isClone(c1);
        c1.isClone(c2);
    }
}
