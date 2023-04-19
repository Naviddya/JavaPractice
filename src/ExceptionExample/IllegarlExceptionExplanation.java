package ExceptionExample;

public class IllegarlExceptionExplanation {
    public  static  void  print(int age)
    {
        if(age>=18)
        {
            System.out.println("Eligle for voting");
        }
        else
        {
            throw new IllegalArgumentException("not eligible for voting");
        }
    }

    public  static  void main(String [] args)
    {
     IllegarlExceptionExplanation.print(5);
    }
}
