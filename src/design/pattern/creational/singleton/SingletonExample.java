package design.pattern.creational.singleton;

/**
 * @author Pramit Karmakar
 * @Date 16/Nov/2023
 */
public class SingletonExample {

    private final String s;

    private static SingletonExample singletonInstance = null;

    private SingletonExample(String s) {
        if (singletonInstance != null) {
            throw new RuntimeException("Cannot invoke directly");
        } else {
            this.s = s;
        }
    }

    public static SingletonExample getInstance(String s) {

        if (singletonInstance ==  null) {
            synchronized (SingletonExample.class) {
                if (singletonInstance == null) {
                    singletonInstance = new SingletonExample(s);
                }
            }
        }
        return singletonInstance;
    }

    public String getS() {
        return this.s;
    }
}
