package threeds.hw3;

public class Three implements Runnable {
    @Override
    public void run() {
        synchronized (Starter.monitor) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getId() + "Thread number THREE");
            }
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
