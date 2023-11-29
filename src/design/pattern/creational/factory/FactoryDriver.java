package design.pattern.creational.factory;

/**
 * @author Pramit Karmakar
 * @Date 16/Nov/2023
 */
public class FactoryDriver {

    public static void main(String[] args) {

        NotificationFactory nf = new NotificationFactory();

        nf.notifyUser("email");
        nf.notifyUser("push");
        nf.notifyUser("sms");
        nf.notifyUser("mms");
    }
}
