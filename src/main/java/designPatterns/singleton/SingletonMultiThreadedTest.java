package designPatterns.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonMultiThreadedTest {
    public static void main(String[] args) {
        // MultiThreaded Env.
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(SingletonMultiThreadedTest::getSingletonObject);
        executorService.submit(SingletonMultiThreadedTest::getSingletonObject);

    }

    public static void getSingletonObject() {
        TrueSingleton instance = TrueSingleton.getInstance();
        System.out.println("Singleton Instance :: " + instance.hashCode());
    }
}
