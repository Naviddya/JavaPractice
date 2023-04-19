package MultithreadingExample;

public class Student extends Thread {
    @Override
    public void run() {
        System.out.println("****"+Thread.currentThread().getName()+"****");
    }
}
