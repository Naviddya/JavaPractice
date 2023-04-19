package ObjectExample;

public class EqualsMethod_Student {

    private  double rem,em;

    public  EqualsMethod_Student(double rem,double em)
    {
        this.rem=rem;
        this.em=em;
    }

    public static void main(String[] args) {

        EqualsMethod_Student student=new EqualsMethod_Student(20,3);
        EqualsMethod_Student student1=new EqualsMethod_Student(20,3);


        if(student == student1)
        {
            System.out.println("we have same value");
        }
        else
        {
            System.out.println("we dont have same value");
        }

    }


}


