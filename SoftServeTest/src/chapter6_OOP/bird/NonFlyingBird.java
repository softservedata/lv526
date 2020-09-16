package chapter6_OOP.bird;

import chapter6_OOP.bird.Bird;

public class NonFlyingBird extends Bird {
    @Override
    protected void fly() {
        System.out.println(" I cant fly ");
    }

    @Override
    public boolean isFeathers() {
        return super.isFeathers();
    }

    @Override
    public boolean isLayEgg() {
        return super.isLayEgg();
    }
}
