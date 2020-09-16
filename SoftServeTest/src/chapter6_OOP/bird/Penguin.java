package chapter6_OOP.bird;

import chapter6_OOP.bird.NonFlyingBird;

public class Penguin extends NonFlyingBird {
    private boolean feathers;
    private boolean layEgg;
    @Override
    protected void fly() {
        super.fly();
    }

    @Override
    public boolean isFeathers() {
        System.out.println("Penguin havent feathers");
        return false;
    }

    @Override
    public boolean isLayEgg() {
        System.out.println(" PEnguin can lay egg ");
        return true;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "feathers=" + feathers +
                ", layEgg=" + layEgg +
                '}';
    }
}
