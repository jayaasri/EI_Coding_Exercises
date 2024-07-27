package notification;

public class NotificationFactory {
    public Notification createNotification(String type) {
        if (type.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        }
        throw new IllegalArgumentException("Unknown notification type");
    }
}
