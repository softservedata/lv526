package threeds.hw3;

public class One implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId()+ " Thread one started ");
        synchronized (Starter.monitor) {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Runnable threadTWO = new Two();
            Thread thread = new Thread(threadTWO);
            System.out.println(" Thread ONE called thread TWO ");
            thread.start();


        }

    }
}
