package notification;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification email = factory.createNotification("EMAIL");
        email.notifyUser();

        Notification sms = factory.createNotification("SMS");
        sms.notifyUser();
    }
}
