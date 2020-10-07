package threeds.hw3;

public class Two implements Runnable {
    @Override
    public void run() {
        synchronized (Starter.monitor){
            for(int i = 0 ; i < 3 ; i++) {
                System.out.println(Thread.currentThread().getId() + "Thread number TWO ");
            }
            try {
                Thread.sleep(9000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
