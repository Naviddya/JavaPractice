package MultithreadingExample;

public class ThreadExample extends  Thread {

    @Override
    public void run() {
        System.out.println("current thread name "+ Thread.currentThread().getName());
        System.out.println("run method called");
    }
}

class GeeksforGreeks
{
    public static void main(String[] args) {
        ThreadExample t=new ThreadExample();
        t.start();
       t.run();
       t.run();
    }
}
