import java.lang.*;
public class YieldMethod extends Thread{
    public void run()
    {
        // Thread.yield();   // if you want to stop thread 0 and provide to chance other thread/main
        for (int i =1;i<=5;i++)
        {
            try {
                System.out.println(Thread.currentThread().getName()+" "+i);
                Thread.sleep(1000);
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        YieldMethod y = new YieldMethod();
        y.start();

        Thread.yield(); // if you want to stop main method thread and provide to chance other thread
        for (int i =1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
