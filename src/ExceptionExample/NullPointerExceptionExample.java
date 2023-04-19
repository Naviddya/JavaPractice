package ExceptionExample;

public class NullPointerExceptionExample {
    public  static  void main(String args[])
    {
        try
        {
            String str=null;
            System.out.println(str.charAt(0));

        }
        catch (NullPointerException e)
        {
            System.out.println("Nulllpointer exception");
        }
    }
}
