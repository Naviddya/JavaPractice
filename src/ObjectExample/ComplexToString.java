package ObjectExample;

public class ComplexToString {

    private double re,eml;

    public  ComplexToString()
    {
        this.re=re;
        this.eml=eml;
    }
    public String toString()
    {
        return  this.re+" "+this.eml;
    }
    public static void main(String[] args) {
        ComplexToString str=new ComplexToString();
        System.out.println(str);
    }
}

