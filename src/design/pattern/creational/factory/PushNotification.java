package design.pattern.creational.factory;

/**
 * @author Pramit Karmakar
 * @Date 16/Nov/2023
 */
public class PushNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending Push notification");
    }
}
