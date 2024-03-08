package org.example.creational.prototype;

public abstract class Vechicle {
    public int wheels;
    public long price;

    public Vechicle() {

    }

    public Vechicle(Vechicle target) {
        if (target != null) {
            this.wheels = target.wheels;
            this.price = target.price;
        }
    }

    public abstract Vechicle clone();

    public abstract boolean isClone(Vechicle target);
}
