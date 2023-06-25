import java.lang.*;
public class sleepMethodwithOneArgument1 {
    public static void main(String[] args) {   // main thread
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
}

// In this program main thread execution will paused for 1000 millis.