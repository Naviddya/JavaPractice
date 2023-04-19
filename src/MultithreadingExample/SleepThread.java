package MultithreadingExample;

import java.sql.SQLOutput;

public class SleepThread {

    public static void main(String[] args) {
        try
        {
            for(int i=0;i<5;i++)
            {
                Thread.sleep(1000);
                System.out.println(i);
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
}
