import java.lang.*;
public class threadPriorityMethod extends Thread {
    @Override
    public void run() {
        System.out.println("child thread");
        System.out.println(Thread.currentThread().getPriority());// displaying the thread priority
    }

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getPriority()); //displaying the main thread priority
        threadPriorityMethod pm =new threadPriorityMethod();
        pm.start();
    }
}

// by default main thread priority is 5
// child thread priority is also 5  because the priority of thread from create from main thread will be same.
