package MultithreadingExample;
//creating a thread with a first way
public class MyThread implements Runnable {
    @Override
    public void run() {
        //task for thread

        for(int i=0;i<10;i++)
        {
            System.out.println("value of is "+i);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e)
            {

            }
        }
    }

    public static void main(String[] args) {

        MyThread t1=new MyThread();


        Thread thr=new Thread(t1);
        thr.start();

        MyAnotherThread myAnotherThread=new MyAnotherThread();

       // t1.start();

        myAnotherThread.start();
       // t1.start();

    }
}
