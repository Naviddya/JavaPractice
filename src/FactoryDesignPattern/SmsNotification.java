package FactoryDesignPattern;

public class SmsNotification implements Notfication {

    @Override
    public void notifyUser() {
        System.out.println("sms has been send");
    }
}
