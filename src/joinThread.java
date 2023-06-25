import java.lang.*;
public class joinThread extends Thread {
    public void run()
    {
        try
        {
            for (int i =1;i<=5;i++)
            {
                System.out.println("Chlid "+Thread.currentThread().getName() +" "+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        joinThread j = new joinThread();
        j.start();

        j.join();
        try {
            for (int i =6;i<=10;i++)
            {
                System.out.println("thread "+ Thread.currentThread().getName()+" "+i);
                Thread.sleep(1000);
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
