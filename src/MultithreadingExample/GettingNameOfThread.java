package MultithreadingExample;

public class GettingNameOfThread extends Thread{

    public  GettingNameOfThread(String name)
    {
        super(name);

    }

    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

class Gfg
        {
            public static void main(String[] args)

            {
                GettingNameOfThread name=new GettingNameOfThread("Thread name is navi");
                GettingNameOfThread name2=new GettingNameOfThread("thread name is batra");

                System.out.println("getting the name of thread"+name.getName());
                System.out.println("getting the name of second tread"+name2.getName());
                name.start();
                name2.start();
            }
        }