import java.lang.*;
public class sleepInMultiThread extends Thread{
    public void run()
    {
       try {
           for (int i=1;i<=5;i++)
           {
               System.out.println(i+" "+Thread.currentThread().getName());
               Thread.sleep(1000);
           }
       } catch (Exception e)
           {
               System.out.println(e);
           }
    }

    public static void main(String[] args) {
        sleepInMultiThread stm1 = new sleepInMultiThread();
        stm1.start();

        // stm1.run();

// creating multi Thread
        sleepInMultiThread stm2 = new sleepInMultiThread();
        stm2.start();

        // stm2.run();
    }
}
