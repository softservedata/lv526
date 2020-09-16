package chapter6_OOP.bird;

public class Eagle extends FlyingBird {


    @Override
    public String toString() {
        return "Eagle{" +
                "feathers=" + isFeathers() +
                ", layEgg=" + isLayEgg() +
                '}';
    }
}
