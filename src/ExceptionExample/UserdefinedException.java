package ExceptionExample;

public class UserdefinedException {

    public static void main(String[] args)  throws InterruptedException{

        for(int i=0;i<10;i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }




//        throw new InvalidAgeException("age is cnt less then 18");
//        throw  new ArithmeticException(" divide by zero");
    }
}
