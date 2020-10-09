package com.softserve.hw10;

class MyThread1 implements Runnable {
    private String message;
    private Thread thead1;
    private Thread thead2;

    public MyThread1(String message, Thread thead1, Thread thead2) {
        this.message = message;
        this.thead1 = thead1;
        this.thead2 = thead2;
    }

    public void run() {
        if (thead1 != null) {
            try {
                thead1.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if (thead2 != null) {
            try {
                thead2.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class ApplThread1 {
    public static void main(String[] args) throws InterruptedException {
       Thread t1 = new Thread(new MyThread1("111", null, null));
       Thread t2 = new Thread(new MyThread1("222", null, null));
       t1.start();
       t2.start();
       Thread t3 = new Thread(new MyThread1("333", t1, t2));
       //
       t3.start();
       //t3.join();
       System.out.println("End");
    }
}
