package com.softserve.hw10;

class MyThread implements Runnable {
    private String message;

    public MyThread(String message) {
        this.message = message;
    }

    public void run() {
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

public class ApplThread {
    public static void main(String[] args) throws InterruptedException {
       Thread t1 = new Thread(new MyThread("111"));
       Thread t2 = new Thread(new MyThread("222"));
       Thread t3 = new Thread(new MyThread("333"));
       //
       t1.start();
       t2.start();
       t1.join();
       t2.join();
       t3.start();
       t3.join();
       System.out.println("End");
    }
}
