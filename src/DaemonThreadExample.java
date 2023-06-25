public class DaemonThreadExample {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(new DaemonTask());
        daemonThread.setDaemon(true); // Set the thread as a daemon thread
        daemonThread.start();

        System.out.println("Main thread is running");

        try {
            Thread.sleep(3000); // Sleep for 3 seconds to allow the daemon thread to execute
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is exiting");
    }
}

class DaemonTask implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Daemon thread is running");
            try {
                Thread.sleep(1000); // Sleep for 1 second before printing the next message
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
