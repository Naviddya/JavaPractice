package ExceptionExample;

public class NPE {

    public static void main(String[] args) {

        try {
            String str = null;

            System.out.println(str.toUpperCase());

        }
        catch (NullPointerException ex)
        {
            System.out.println(ex);
        }
    }
}
