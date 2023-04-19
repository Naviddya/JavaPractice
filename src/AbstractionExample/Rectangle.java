package AbstractionExample;

public class Rectangle extends Shape {

    double length,breath;
    @Override
    public double area() {
        return  length*breath;
    }

    public Rectangle(String color,double length,double breath) {
        super(color);
        this.length=length;
        this.breath=breath;

    }

//    @Override public String toString()
//    {
//        return "Circle color is " + super.getColor()
//                + "and length is : " + lenth();
//    }


}
