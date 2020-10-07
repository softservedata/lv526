package threeds;

public class HW2 {
    public final static Object first = new Object();
    public final static Object second = new Object();


    public static void main(String [] args) {
        Thread thread1 = new Thread() {
            public void run() {
                synchronized (first) {
                    Thread.yield();
                    synchronized (second) {
                        System.out.println("Succcess !");
                    }
                }

            }
        };
        Thread thread2 = new Thread(){
            public void run(){
                synchronized (second){
                    Thread.yield();
                    synchronized (first){
                        System.out.println("Success !");
                    }
                }
            }

        };
        thread1.start();
        thread2.start();





    }
}
