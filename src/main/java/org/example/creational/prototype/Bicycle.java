package org.example.creational.prototype;

public class Bicycle extends Vechicle {
    private boolean cityBike;

    public Bicycle(int wheels, long price, boolean cityBike) {
        this.cityBike = cityBike;
        this.wheels = wheels;
        this.price = price;
    }

    public Bicycle(Bicycle target) {
        super(target);
        if (target != null) {
            this.cityBike = target.cityBike;
        }
    }

    @Override
    public Vechicle clone() {
        return new Bicycle(this);
    }

    @Override
    public boolean isClone(Vechicle target) {
        if (target instanceof Bicycle) {
            Bicycle t = (Bicycle) target;
            if (cityBike == t.cityBike && wheels == t.wheels && price == t.price) {
                System.out.println(this + " " + t + " " + "are clones");
                return true;
            }
        }
        return false;
    }
}

