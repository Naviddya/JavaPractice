package Encapsulation;

public class Students {


   private String name;
   private int id;


    public Students(String name,int id)
    {
        this.name=name;
        this.id=id;
    }

    public  void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }


    public void setId(int id)
    {
        this.id=id;

    }

    public int getId()
    {
        return id;
    }

}

class  main
{
    public static void main(String[] args) {
        Students str=new Students("navi",2);
        str.setId(4);
       // str.getId();
        str.setName("navid");
        str.getName();
        System.out.println(str.getId()+str.getName());


//        str.name="navid";
//        str.id=1;
//        System.out.println(str.name);
//        System.out.println(str.id);


    }
}