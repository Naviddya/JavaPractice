package MultithreadingExample;

public class UsingRunnableInterface implements  Runnable{


    @Override
    public void run() {
        System.out.println("thread is created by runnung Runable interfavce");
    }

    public static void main(String[] args) {

        UsingRunnableInterface obj=new UsingRunnableInterface();

        Thread objofthread=new Thread(obj);

        objofthread.start();
    }
}
