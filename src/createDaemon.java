import java.lang.*;
public class createDaemon extends Thread {
    @Override
    public void run() {
        System.out.println("Daemon thread");
    }

    public static void main(String[] args) {
        System.out.println("Main thread");
        createDaemon cd = new createDaemon();
        cd.setDaemon(true);
        cd.start();
    }
}
