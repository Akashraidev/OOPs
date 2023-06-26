import java.lang.*;
public class sleepMethodwithOneArgument2 extends Thread {

    public void run()
    {
        for (int i=1;i<=10;i++)
        {
            try
            {
                Thread.sleep(1000);
                System.out.println(i);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {   // main thread
       sleepMethodwithOneArgument2 s= new sleepMethodwithOneArgument2();
       s.start();
    }
}

// In this program  Thread 0 execution will paused for 1000 millis.