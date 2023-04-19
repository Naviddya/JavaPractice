package ExceptionExample;

public class ArithematicExceptionExample {

    public static  void main(String args[])
    {
        try
        {
            int a=30;
            int b=0;
            int c=a/b;

        }
        catch (ArithmeticException e)
        {
            System.out.println("Cant divde the no by zero ");
        }
    }
}
