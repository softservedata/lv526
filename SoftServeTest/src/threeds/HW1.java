package threeds;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HW1 implements Runnable {
    public static Object monitor = new Object();
    String message;

    public HW1(String message) {
        this.message = message ;
    }

    @Override
    public void run() {
        synchronized (HW1.monitor) {
            System.out.println(" Current thread ID : " + Thread.currentThread().getId());
            System.out.println(Thread.currentThread().getName() + "(Start message = )" + message );
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "HW1{" +
                ", s='" + message + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {

            Runnable thread1 = new HW1(" THREAD " + i);
            Thread thread = new Thread(thread1);
            executorService.execute(thread);
       //     if (thread.getName().equals("pool-1-thread-3 ")){
       //         System.out.println("lala");
       //     }

         // Run three threads and output there different messages for 5 times.

        }
        executorService.shutdown();
        while (!executorService.isTerminated()) ;
    }


}
