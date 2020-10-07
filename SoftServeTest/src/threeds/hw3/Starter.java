package threeds.hw3;

public class Starter {
    public static Object monitor = new Object();

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getId()+ " Started thread main ");
        Runnable thread1 = new One();
        Thread thread11 = new Thread(thread1);

        Runnable thread3 = new Three();
        Thread thread33 = new Thread(thread3);

        thread11.start();
        thread11.join();
        thread33.start();
        thread33.join();
    }
}
