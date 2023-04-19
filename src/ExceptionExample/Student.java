package ExceptionExample;

public class Student extends StudentException {


    private String name;
    private int age;


    public Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void validate(String name,String age) throws StudentException {




        if (name.length() < 6) {
            System.out.println("we can create object ");
        }

            else {
                throw new StudentException("you are exceeding the limit so object cant be created");
            }


    }


    public  static  void main(String args[]) throws StudentException
    {
         Student objname=new Student("navi",18);

       try {
           objname.validate("naviddya","18");
       }
       catch(Exception e) {
           System.out.println("character should not be more then that");
       }







    }
}

/// write a exception  if are adding  object and object length is greater it will throw execption
