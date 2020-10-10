package threeds.PT2;

public class HelloWorld implements Runnable {
    private String hello = " Hello  , World  ";

    @Override
    public void run() {
     //   synchronized (MassagerMaker.monitor) {
            System.out.println(" ID ( HELLO WORLD ) thread is : " + Thread.currentThread().getId());
            System.out.println(hello);
            for (int i = 0; i < 10; i++) {
                System.out.println(hello);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
