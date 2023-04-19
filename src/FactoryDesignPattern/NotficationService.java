package FactoryDesignPattern;

public class NotficationService {


    public static void main(String[] args) {
        FactoryNotification notificationFactory=new FactoryNotification();


        Notfication notfication=notificationFactory.createNotification("SMS");
        notfication.notifyUser();

    }
}
