package design.pattern.creational.factory;

/**
 * @author Pramit Karmakar
 * @Date 16/Nov/2023
 */
public class NotificationFactory {

    Notification notification;
    public void notifyUser(String notificationType) {
        if (notificationType.equalsIgnoreCase("Email")) {
            notification = new EmainNotification();
        } else if (notificationType.equalsIgnoreCase("push")) {
            notification = new PushNotification();
        } else if (notificationType.equalsIgnoreCase("sms")) {
            notification = new SMSNotification();
        } else {
            throw new RuntimeException("Unsupported Notification type");
        }
        notification.notifyUser();
    }
}
