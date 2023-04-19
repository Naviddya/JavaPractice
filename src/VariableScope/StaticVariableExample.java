package VariableScope;

public class StaticVariableExample {


    static int a=10;

    static {
        System.out.println("hi static ");
    }


    public  void add()
    {
        int a = 0,b = 0;
        int x= a + b;
    }
    static  int main()    {
        System.out.println();
        return 20;
    }
    public  static  void main(String args[])
    {


                System.out.println(a);
                main();

    }


}

