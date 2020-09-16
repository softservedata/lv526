package chapter6_OOP.bird;

public class Chicken extends NonFlyingBird {
    public Chicken() {
        super(true);
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "feathers=" + isFeathers() +
                ", layEgg=" + isLayEgg() +
                '}';
    }
}
