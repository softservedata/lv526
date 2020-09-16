package chapter6_OOP.bird;

import chapter6_OOP.bird.NonFlyingBird;

public class Penguin extends NonFlyingBird {

    public Penguin() {
        super(false);
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "feathers=" + isFeathers() +
                ", layEgg=" + isLayEgg() +
                '}';
    }
}
