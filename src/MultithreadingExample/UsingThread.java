package MultithreadingExample;

public class UsingThread  extends Thread
{

    @Override
    public void run() {

        System.out.println("Thread is running by extending  thread class");
    }

    public static void main(String[] args) {
        UsingThread obj=new UsingThread();

        obj.run();
    }
}
