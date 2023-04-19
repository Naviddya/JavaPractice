package MultithreadingExample;
//creating a thread  from thread class

public class MyAnotherThread extends Thread  {

public  void run()
{
    for(int i=0;i<10;i++)
    {
        System.out.println("another thread"+i);

        try {
        Thread.sleep(2000);
    }
    catch(Exception ex)
        {

    }
    }
}

}
