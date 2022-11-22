package designPatterns.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

class ImproperSingleton {
    public static void main(String[] args) throws Exception {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("s1 :" + s1.hashCode());
        System.out.println("s2 :" + s2.hashCode());

        try {
            //Object Creation by Reflection
            Class aClass = Class.forName("designPatterns.singleton.Singleton");
            Constructor<Singleton> constructor = aClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            Singleton s3 = constructor.newInstance();
            System.out.println("Reflection s3 :" + s3.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Serialization/ Deserialization Way new Object Creation
        String fileName = "/s4.ser";
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
        outputStream.writeObject(s1);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
        Singleton s4 = (Singleton) objectInputStream.readObject();

        System.out.println("Serialization s4 :" + s4.hashCode());

        //Cloning By Object
        Singleton s5 = (Singleton) s1.clone();
        System.out.println("Cloned s5 :" + s5.hashCode());

    }
}

public class Singleton implements Serializable, Cloneable {

    private static Singleton singletonInstance;

    private Singleton() {
        System.out.println("New Instance Created for the class");
    }

    static Singleton getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    private Object readResolve() {
        return singletonInstance;
    }
}