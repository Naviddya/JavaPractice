package MultithreadingExample;

public class ThreadOp {

    public static void main(String[] args) {

        System.out.println("program started");

        int x=56+32;
        System.out.println("sum of x is"+x);
      Thread t=Thread.currentThread();
      String name=t.getName();

      //set name
        t.setName("Mymain");
        System.out.println(t.getName());
        try {
            Thread.sleep(5000);
        }
        catch (Exception ex)
        {

        };

        System.out.println(t.getId());
        System.out.println("thread name "+name);
        System.out.println("program ended");
    }

}
