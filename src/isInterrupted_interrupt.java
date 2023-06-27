import java.lang.*;
public class isInterrupted_interrupt extends Thread{
    public void run()
    {
        System.out.println(Thread.interrupted());
        try
        {
            for (int j=1;j<=5;j++)
            {
                System.out.println(j);
                Thread.sleep(1000);
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        interruptMethodExample i = new interruptMethodExample();
        i.start();
       // i.interrupt();
    }
}
