package Java8Features.Lambda;


@FunctionalInterface
public interface Calculator {


    //void sum(int input);
   // void switchOn();

    // method with retunr type and with more paramter
    int subtract(int a1,int a2);
}

class clcImpl
{
//    @Override
//    public void  switchOn()
//    {
//        System.out.println("has been called with earlier mehtod");
//    }
}

class  main
{
    public static void main(String[] args) {
//        // this is the earlier mehtod which we  folllow now  lets do with lambda express
//        Calculator calc=new clcImpl();
//        calc.switchOn();

//
    //   Calculator calc= () -> System.out.println("has been called with earlier mehtod");

     //  calc.switchOn();


        //lambda exper with anonyomus function with parameter
      // Calculator calc =(int input)-> System.out.println("lambda experess has been called with parameter"+input);
        // calc.sum(10);

//        Calculator calc= (int a1,int a2) ->
//        {
//                return a1-a2;
//        };
            Calculator calc=(a1,a2)->a1-a2;
        calc.subtract(20,35);




    }
}
