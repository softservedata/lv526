package forMe.threds;

public class RunDevide1 implements Runnable {

    @Override
    public void run() {
        boolean isWait = false;
        int k;
        System.out.println("-Thread ID =  " + Thread.currentThread().getId());
        for (int i = 0; i < 100; i++) {
         /*   k = Appl.summ;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Appl.summ = k - 1;
            System.out.print("-");
          */
            synchronized (Appl.monitor) {
                k = Appl.summ;
                try {
                    if ((k < 0)&& isWait ) {
                        isWait = false;

                    }
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Appl.summ = k - 1;
                System.out.print("-");
            }
        }
        System.out.println("Done- , sum =  " + Appl.summ);
    }
}
