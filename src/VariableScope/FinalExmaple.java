package VariableScope;

public class FinalExmaple {


    final int a= 10;

    final void  sirname()
    {
        System.out.println("batra");
    }

    public void lastname() {
        System.out.println("singh");
    }
    // we have final method not final variable
    // if we declare the method as final  it can be overridern
    // if we declare the class final we cnat cant inherit
    //no one can chaneg teh final value
    // real time exmple of  final

}
 class child extends FinalExmaple
         {

            final  void childsiranme()
             {
                 System.out.println("eku dee");
             }

                     public  static  void main(String [] args)
                     {
                         child obj=new child();
                         FinalExmaple parent=new child();
                         parent.lastname();
                         //child.lastname();
                     }


         }