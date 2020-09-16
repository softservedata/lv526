package chapter6_OOP.bird;

public class BirdsTester {
    public static void main(String[] args) {
        Bird swallow1 = new Swallow();
        Bird eagle1 = new Eagle();
        Bird chicken1 = new Chicken();
        Bird penguin1 = new Penguin();
        Bird swallow2 = new Swallow();
        Bird eagle2 = new Eagle();
        Bird [] birdArray = {swallow1 , eagle1 , chicken1 , penguin1 , swallow2 , eagle2};

        for (Bird bird : birdArray){
            bird.fly();
            bird.isFeathers();
            bird.isLayEgg();
            System.out.println(bird);
            System.out.println("----------");

        }
     }
}
