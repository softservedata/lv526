package chapter6_OOP.bird;

import chapter6_OOP.bird.Bird;

public class FlyingBird extends Bird {
    public FlyingBird() {
        super(true, true);
    }

    @Override
    protected void fly() {
        System.out.println(" I can fly ");

    }
}
