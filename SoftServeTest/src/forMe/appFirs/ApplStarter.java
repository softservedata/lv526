package forMe.appFirs;

public class ApplStarter {
    public static void main(String[] args) {
        Appl apppl = new Appl();
        apppl.setVisible(true);
        System.out.println("main() : Thread ID = " + Thread.currentThread().getId());
    }
}
