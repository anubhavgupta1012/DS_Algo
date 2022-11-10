package com.ds.coreJava.multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {
    public static void main(String[] args) {
        new ExecutorServiceTest().extracted();
    }

    private void extracted() {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<String> list = Arrays.asList("1", "2", "3", "4", "5");
        list.stream().forEach(i -> executorService.execute(() -> send(i)));
    }

    public static void send(String str) {
        System.out.println(str);
    }
}


