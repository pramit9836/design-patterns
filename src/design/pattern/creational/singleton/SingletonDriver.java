package design.pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Pramit Karmakar
 * @Date 16/Nov/2023
 */
public class SingletonDriver {

    public static void main(String[] args) {

        SingletonExample singletonExample = SingletonExample.getInstance("Pramit");
        System.out.println(singletonExample.getS());
        singletonExample = SingletonExample.getInstance("Chikoo");
        System.out.println(singletonExample.getS());
        try{
            Constructor<SingletonExample> pcc = SingletonExample.class.getDeclaredConstructor();
            pcc.setAccessible(true);
            SingletonExample privateConstructorInstance = pcc.newInstance();
            System.out.println(privateConstructorInstance.getS());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
