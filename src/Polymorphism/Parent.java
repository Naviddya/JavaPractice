package Polymorphism;

public class Parent {


    public  void print()
    {
        System.out.println("Calling the parent classs");
    }
}


 class child extends  Parent
{
    public  void print()
    {
        System.out.println("Calling the child class");
    }
}