package ExceptionExample;

public class ArrayoutofIndex {

    public  static  void main(String args[])
    {
        try
        {
            String str="this is naviddya";
            System.out.println(str.charAt(26));
            System.out.println(str);
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexoutof boudn");
        }
    }
}
