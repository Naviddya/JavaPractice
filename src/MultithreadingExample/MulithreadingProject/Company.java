//package MultithreadingExample.MulithreadingProject;
//
//public class Company {
//
//  int n;
//  boolean f=false;
//
//  //f=false:chance:produce
//    synchronized  public  void produce_item(int n)
//    {
//        if(f=false)
//        {
//            wait();
//        }
//        this.n=n;
//        System.out.println("produced n"+this.n);
//        f=true;
//        notify();
//    }
//
//    synchronized public  int  consume_item()
//    {
//        if (!f)
//        {
//            wait();
//        }
//        System.out.println("consumed"+this.n);
//        f=false;
//        notify();
//        return this.n;
//    }
//}
