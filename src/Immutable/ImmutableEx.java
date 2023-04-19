package Immutable;

import com.sun.jndi.cosnaming.IiopUrl;

import java.util.ArrayList;
import java.util.List;

final class  ImmutableEx extends Object{

    final int rollNo;
    final String name;

    int phon_no;

   // final String address;

    final List<String> phone=new ArrayList<>();



    public List<String> getPhone() {
        return new ArrayList<>(phone);
    }

    public  ImmutableEx(int rollNo, String name)
   {
       this.rollNo=rollNo;
       this.name=name;
   }

   public String getName()
   {
       return name;
   }
   public int getRollNo()
   {
       return rollNo;
   }

}
  class  immutableDemo
{
    public  static  void main(String args[])
    {
        ImmutableEx obj=new ImmutableEx(1,"batra");
        String s2=obj.getName();
        int s3= obj.getRollNo();
        System.out.println("the out put"+s2+" "+s3);
    }
}
