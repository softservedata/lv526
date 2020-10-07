package threeds;

public class PT1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread ID" + Thread.currentThread().getId());
        for (int i = 0; i < 10; i++) {
            System.out.println(" I study java ");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread ID" + Thread.currentThread().getId());
        Runnable t1 = new PT1();
        Thread tt = new Thread(t1);
      //  tt.join();
        tt.start();

    }
}
