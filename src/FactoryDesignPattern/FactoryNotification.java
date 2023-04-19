package FactoryDesignPattern;

public class FactoryNotification {

    public  Notfication createNotification(String channel)
    {
        if (channel == null)
        {
            return null;

        }
        switch (channel)
        {
            case "SMS":
                return new SmsNotification();

            case "Email":
                    return new Email();

            case "Push":
                return  new PushNotifcation();
            default:
                throw new IllegalArgumentException("unkown channel"+channel);
        }


    }
}
