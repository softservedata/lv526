package forMe.threds;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.processor.ObjectRowListProcessor;

public class Appl {
    public static int summ = 0;
    public static Object monitor = new Object();

    public static void main(String[] args) throws InterruptedException {
        System.out.println(" Main Thread ID = " + Thread.currentThread().getId());
        Runnable runnable1 = new RunAdd1();
        Thread thread1 = new Thread(runnable1);
        //  thread1.setPriority(Thread.MAX_PRIORITY);

        Runnable runnable2 = new RunDevide1();
        Thread thread2 = new Thread(runnable2);
        //  thread2.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Main Done , sum = " + summ);
    }
}

