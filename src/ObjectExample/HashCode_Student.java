package ObjectExample;

public class HashCode_Student {

    static int last_roll_no=111;
     int roll_no;

     HashCode_Student()
     {
         this.roll_no=last_roll_no;
         last_roll_no++;
     }


    @Override
    public int hashCode() {
        return roll_no;

    }

    public static void main(String[] args) {

         HashCode_Student hash=new HashCode_Student();
         System.out.println(hash);
        System.out.println(hash.toString());

    }
}
