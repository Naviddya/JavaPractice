package Polymorphism;

public class Test {

    public static void main(String args[])
    {
        Helper.Multiply(10,20);
        Helper.multiply(10,20,30);


        child obj=new child();
        obj.print();

        Parent p1=new child();
        p1.print();
    }
}
