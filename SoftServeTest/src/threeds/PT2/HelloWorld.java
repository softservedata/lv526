package threeds.PT2;

public class HelloWorld implements Runnable {
    private String hello = " Hello  , World  ";

    @Override
    public void run() {
        synchronized (MassagerMaker.monitor) {
            System.out.println(" ID ( HELLO WORLD ) thread is : " + Thread.currentThread().getId());
            System.out.println(hello);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
