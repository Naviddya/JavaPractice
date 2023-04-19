package MultithreadingExample;

public class ThreadNaming extends Thread{

    @Override
    public void run()
    {
        System.out.println("Thread is running");
    }
}
class GFG
{
    public static void main(String[] args)
    {
    ThreadNaming name1=new ThreadNaming();
    ThreadNaming name2=new ThreadNaming();

        System.out.println("Thread 1"+name1.getName());
        System.out.println("thread 2"+name2.getName());
        name1.start();
        name2.start();


        //Now changing the thread namne
        name1.setName("kabutar1");
        name2.setName("kabutar2");

        System.out.println("thread name changing the "+"thread name");

        System.out.println("new thread 1"+ name1.getName());
        System.out.println(("news thread 2"+name2.getName()));

    }
}
