package chapter6_OOP.bird;

import chapter6_OOP.bird.Bird;

public class NonFlyingBird extends Bird {
    public NonFlyingBird(boolean feathers) {
        super(feathers, true);
    }

    @Override
    protected void fly() {
        System.out.println(" I can not fly ");
    }


}
