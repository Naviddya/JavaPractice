package FactoryDesignPattern;

public class Email implements Notfication{

    @Override
    public void notifyUser() {
        System.out.println("email has been send");
    }
}
