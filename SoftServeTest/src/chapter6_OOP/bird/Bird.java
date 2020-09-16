package chapter6_OOP.bird;

public abstract class Bird {

    private boolean feathers;
    private boolean layEgg;

    public Bird(boolean feathers, boolean layEgg) {
        this.feathers = feathers;
        this.layEgg = layEgg;
    }

    public boolean isFeathers() {
        return feathers;
    }

    public boolean isLayEgg() {
        return layEgg;
    }

    protected abstract void fly();
}
