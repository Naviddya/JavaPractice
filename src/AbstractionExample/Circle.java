package AbstractionExample;

public class Circle extends Shape{

    double radius;
    @Override
    public double area()
    {
        return  radius*radius;

    }

    public Circle(double radius,String color)
    {
        super(color);
        this.radius=radius;
        //this.color=color;
    }
    @Override public String toString()
    {
        return "Circle color is " + super.getColor()
                + "and area is : " + area();
    }


}
