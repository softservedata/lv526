package threeds.PT2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MassagerMaker {
    public static Object monitor = new Object();

    public static void main(String[] args) {
        System.out.println("Main thread : " + Thread.currentThread().getId());
        Runnable t1 = new HelloWorld();
        Thread thread1 = new Thread(t1);
        Runnable t2 = new Peace();
        Thread thread2 = new Thread(t2);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            executorService.execute(thread1);
            //    System.out.println("--------------");
            executorService.execute(thread2);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) ;
        System.out.println("My name is Naazar");
    }
}
