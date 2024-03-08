package org.example.creational.prototype;

public class Car extends Vechicle {
    private String color;

    public Car(int wheels, long price, String color) {
        this.wheels = wheels;
        this.price = price;
        this.color = color;
    }

    public Car(Car target) {
        super(target);
        if (target != null) {
            color = target.color;
        }
    }

    @Override
    public Vechicle clone() {
        return new Car(this);
    }

    @Override
    public boolean isClone(Vechicle target) {
        if (target instanceof Car) {
            Car t = (Car) target;
            if (color == t.color && wheels == t.wheels && price == t.price) {
                System.out.println(this + " " + t + " " + "are clones");
                return true;
            }
        }
        return false;
    }
}
