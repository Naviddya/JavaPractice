package MethodCalling;

public class Students {


    int id;
    private static String name,value;


    public  void show()
    {


        System.out.println("firs methode"+value);
       // System.out.println("first method has been called ");
    }


    public  void show2(String name)
    {
       // System.out.println("second method has been called ");
         value=name;
        System.out.println("second method has been called"+value);
    }

    public String getName()
    {
        return value;
    }




}

class Main
{
    public static void main(String[] args) {

        Students str=new Students();

        str.show2("batra");
        Students str2=new Students();
         String str3=  str.getName();
       // str2.show2(str.getName());
       // str2.show2(str3);
        str2.show();
        //str.show();
        //str2.show();

    }
}