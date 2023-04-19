package InterfaceExample;

public interface InterfaceExmple {

    static   int a=10;
    //by defaulta public static final

    public void dislpay();


}

class test implements InterfaceExmple
{

    //static   int a=20;
    @Override
    public void dislpay() {
        System.out.println("calling the interface from child class");
    }

    public static  void  main(String args[])
    {
        test s=new test();
        s.dislpay();
        System.out.println(a);
    }
}

