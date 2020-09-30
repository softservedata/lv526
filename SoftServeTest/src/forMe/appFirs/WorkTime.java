package forMe.appFirs;

public class WorkTime implements Runnable {
    private Appl dialogTime;

    public WorkTime(Appl dialogTime) {
        this.dialogTime = dialogTime;
    }

    @Override
    public void run() {
        long current ;
        long ms = System.currentTimeMillis();
        current = ms;

        while (System.currentTimeMillis() - ms < 5000){
            if (System.currentTimeMillis() - current > 1 ){
                current = System.currentTimeMillis();
                dialogTime.settOutput(String.valueOf(System.currentTimeMillis()));
            }
        }
        dialogTime.settOutput(String.valueOf(System.currentTimeMillis()));
        System.out.println("Work Time Thread ID" + Thread.currentThread());
    }
}
