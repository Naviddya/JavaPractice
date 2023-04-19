package ConstructoExample;

public class ConstructorExample {


    String name;
    String id;
    int age;
    public  ConstructorExample()
    {
        super();

    }

    public String ConstructorExample(String name,String id)
    {
        return this.name=name +this.id;

    }

    ConstructorExample(String name)
    {
        System.out.println("Constructor with one "
                + "argument - String : " + name);
    }

    // constructor with two arguments
    ConstructorExample(String name, int age)
    {

        System.out.println(
                "Constructor with two arguments : "
                        + " String and Integer : " + name + " " + age);
    }

    // Constructor with one argument but with different
    // type than previous..
    ConstructorExample(long id)
    {
        System.out.println(
                "Constructor with one argument : "
                        + "Long : " + id);
    }

    public static void main(String[] args) {
        ConstructorExample  obj=new ConstructorExample("naviddya",121);

        System.out.println(obj.name+obj.id);
    }
}
