package threeds.PT2;

public class Peace implements Runnable {
    private String peace = "Peace in the peace";

    @Override
    public void run() {
        synchronized (MassagerMaker.monitor) {
            System.out.println("ID ( Peace in the peace )thread is : " + Thread.currentThread().getId());
            System.out.println(" Peace int the peace ");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
