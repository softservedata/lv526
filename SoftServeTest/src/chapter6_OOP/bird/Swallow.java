package chapter6_OOP.bird;

import chapter6_OOP.bird.NonFlyingBird;

public class Swallow extends FlyingBird {

    @Override
    public String toString() {
        return "Swallow{" +
                "feathers=" + isFeathers() +
                ", layEgg=" + isLayEgg() +
                '}';
    }
}
