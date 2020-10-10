package threeds;

public class PT1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread ID" + Thread.currentThread().getId());
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(2000);
                System.out.println(" I study java ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread ID main " + Thread.currentThread().getId());
        System.err.println("_______________");
        Runnable t1 = new PT1();
        Thread tt = new Thread(t1);

        tt.start();
        tt.join();
       System.out.println(" The end");

    }
}
