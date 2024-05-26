package coreJava.java8.streams;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        Student student1 = new Student("Anubhav", 50, "Hindi");
        Student student2 = new Student("Anubhav", 10, "English");
        Student student3 = new Student("Dheeraj", 30, "Hindi");
        Student student4 = new Student("Dheeraj", 70, "Science");
        Student student5 = new Student("Dheeraj", 80, "Maths");
        Student student6 = new Student("Sumian", 90, "Hindi");
        Student student7 = new Student("Raghav", 100, "English");

        List<Student> list = Arrays.asList(student1, student2, student3, student4, student5, student6, student7);

        Map<String, List<Student>> collect = list.stream().collect(Collectors.groupingBy(s -> s.name));
        Map<String, Integer> collect1 = collect.entrySet()
                .stream().collect(Collectors.toMap(k -> k.getKey(), v ->
                        v.getValue().stream().map(s -> s.marks).reduce(0, (a, b) -> a + b)));

        AtomicInteger i = new AtomicInteger(1);
        collect1.entrySet().stream().sorted((c1, c2) -> c2.getValue() - c1.getValue())
                .forEach(z -> {
                    System.out.println(z + " Rank ==" + i.get());
                    i.incrementAndGet();
                });
    }

    static class Student {
        String name;
        int marks;
        String subject;

        public Student(String name, int marks, String subject) {
            this.name = name;
            this.marks = marks;
            this.subject = subject;
        }
    }
}




