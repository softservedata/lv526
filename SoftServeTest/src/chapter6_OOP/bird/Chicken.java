package chapter6_OOP.bird;

public class Chicken extends NonFlyingBird {
    private boolean feathers;
    private boolean layEgg;

    @Override
    protected void fly() {
        super.fly();
    }

    @Override
    public boolean isFeathers() {
        System.out.println(" chicken have feathers");

        return true;
    }

    @Override
    public boolean isLayEgg() {
        System.out.println(" chicken can lay egg ");
        return true;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "feathers=" + feathers +
                ", layEgg=" + layEgg +
                '}';
    }
}
