package designPatterns.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

class ProperSingleton {
    public static void main(String[] args) throws Exception {
        TrueSingleton s1 = TrueSingleton.getInstance();
        TrueSingleton s2 = TrueSingleton.getInstance();
        System.out.println("s1 :" + s1.hashCode());
        System.out.println("s2 :" + s2.hashCode());

        try {
            //Object Creation by Reflection
            Class aClass = Class.forName("designPatterns.singleton.TrueSingleton");
            Constructor<TrueSingleton> constructor = aClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            TrueSingleton s3 = constructor.newInstance();
            System.out.println("Reflection s3 :" + s3.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Serialization/ Deserialization Way new Object Creation
        String fileName = "/s4.ser";
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
        outputStream.writeObject(s1);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
        TrueSingleton s4 = (TrueSingleton) objectInputStream.readObject();

        System.out.println("Serialization s4 :" + s4.hashCode());

        //Cloning By Object
        TrueSingleton s5 = (TrueSingleton) s1.clone();
        System.out.println("Cloned s5 :" + s5.hashCode());

    }
}

public class TrueSingleton implements Serializable, Cloneable {

    private static volatile TrueSingleton singletonInstance;

    private TrueSingleton() {
        if (singletonInstance != null)
            throw new RuntimeException("Use getInstance() for instantiation if Singleton Object");

        System.out.println("New Instance Created for the class");
    }


    synchronized static TrueSingleton getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new TrueSingleton();
        }
        return singletonInstance;
    }

    static TrueSingleton getInstance2() {
        if (singletonInstance == null) {    //check1
            synchronized (Singleton.class) {
                if (singletonInstance == null)      //check2
                    singletonInstance = new TrueSingleton();
            }
        }
        return singletonInstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return singletonInstance;
    }

    private Object readResolve() {
        return singletonInstance;
    }
}