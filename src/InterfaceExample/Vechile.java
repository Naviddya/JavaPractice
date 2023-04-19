package InterfaceExample;

public interface Vechile {

    public int engineCC=1500;
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
    static  void display()
    {

            }
}

class Maruti implements Vechile
{
    int speed;
    int gear;
    @Override
    public  void changeGear(int newGear)
    {
       gear=newGear;
    }
    @Override
    public  void speedUp(int newsSpeed)
    {
        speed=newsSpeed;
    }

    @Override
    public void applyBrakes(int a) {
        System.out.println("System i");
    }
}