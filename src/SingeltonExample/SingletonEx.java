package SingeltonExample;

public class SingletonEx {


    private static SingletonEx ex;
    private SingletonEx()
    {
        // we have created a private constructor  so that no no other class can access it
    }


    public  static SingletonEx getInstance()
    {
        if(null == ex)
        {
          //  ex=new ex();
        }
        return ex;
    }
    public static void main(String[] args) {


       SingletonEx ex=SingletonEx.getInstance();
      // SingletonEx ex1=SingletonEx.getInstance();
    }
}
