package chapter6_OOP.bird;

import chapter6_OOP.bird.Bird;

public class FlyingBird extends Bird {
    @Override
    protected void fly() {
        System.out.println(" I can fly ");

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
