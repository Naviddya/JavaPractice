package Java8Features;

public class MethodReferenceEx {

    public  void meth()
    {
        System.out.println("method one has been called ");

    }

    static  void meth2()
    {
        System.out.println(" Static method has been called");
    }
}
class main
{
    public static void main(String[] args)

    {
        MethodReferenceEx.meth2();

        MethodReferenceEx obj=new MethodReferenceEx();
        obj.meth();

        //obj::meth();   //instance method reference;
        //reference::methodName
        //MethodReferenceEx::meth2();//static method refernce


        //constructor method reference



    }
}
