package VariableScope;

public class StaticMethodExample {

    static int a=10;

    int b=20;


    static  void share()
    {

        int a=20;
        //b=30;
        //System.out.println(super.a);

        System.out.println("you cannont call non static varaible in static methid");
    }

          public  static  void main(String args[])
          {

              StaticMethodExample.share();


              StaticMethodExample str=new StaticMethodExample();
              str.share();
          }

}
