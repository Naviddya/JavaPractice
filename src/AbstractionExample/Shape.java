package AbstractionExample;

abstract class Shape {
    public  Shape()
    {

    }

    String color;

   public abstract double area();

   public Shape(String color)
   {
       System.out.println("Shape constructore should be called");
       this.color=color;
   }

   public String getColor()
   {
       return color;
   }


}
