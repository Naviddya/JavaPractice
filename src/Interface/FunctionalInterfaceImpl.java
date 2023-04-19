package Interface;

public class FunctionalInterfaceImpl implements FunctionalInterfaceEx{


    public  void  say(String msg)
    {
        System.out.println("hi i have been called ");

    }


    public static void main(String[] args) {

        FunctionalInterfaceImpl ex=new FunctionalInterfaceImpl();
        ex.say("i have been called");

    }
}
