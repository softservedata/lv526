package chapter6_OOP.bird;

public class Eagle extends FlyingBird {
    private boolean feathers;
    private boolean layEgg;

    @Override
    protected void fly() {
        super.fly();
    }

    @Override
    public boolean isFeathers() {
        System.out.println(" Yes eagle have feathers ");
        return true;
    }

    @Override
    public boolean isLayEgg() {
        System.out.println(" Eagle havent eggs");
        return false;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "feathers=" + feathers +
                ", layEgg=" + layEgg +
                '}';
    }
}
