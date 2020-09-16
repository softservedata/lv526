package chapter6_OOP.bird;

import chapter6_OOP.bird.NonFlyingBird;

public class Swallow extends NonFlyingBird {
    private boolean feathers;
    private boolean layEgg;
    @Override
    protected void fly() {
        super.fly();
    }

    @Override
    public boolean isFeathers() {
        System.out.println(" Swallow has swallow");
        return true;
    }

    @Override
    public boolean isLayEgg() {
        System.out.println(" Swallow can lay eggs");
        return true;
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "feathers=" + feathers +
                ", layEgg=" + layEgg +
                '}';
    }
}
