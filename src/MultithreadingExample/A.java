package MultithreadingExample;

public class A extends  Thread {

    public  void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.println("navi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


  class B extends Thread
{
    public  void  run()
    {
        for(int i=0;i<10;i++)

        {
            System.out.println("hi");

    }
    }
}

class Demo
{
    public static void main(String[] args) {
        A obj=new A();
        B obj2=new B();


        obj2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("how to get priority"+obj2.getPriority());
        obj.start();
        obj2.start();

    }
}
