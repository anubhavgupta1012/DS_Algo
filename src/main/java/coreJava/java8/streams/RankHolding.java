package coreJava.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class RankHolding {
    public static void main(String[] args) {
        Student student1 = new Student("Anubhav", 50, "Hindi");
        Student student2 = new Student("Anubhav", 10, "English");
        Student student3 = new Student("Dheeraj", 30, "Hindi");
        Student student4 = new Student("Dheeraj", 70, "Science");
        Student student5 = new Student("Dheeraj", 80, "Maths");
        Student student6 = new Student("Sumian", 90, "Hindi");
        Student student7 = new Student("Raghav", 100, "English");

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        list.add(student7);

        // Summing up all the marks and deciding the rank
        AtomicInteger count = new AtomicInteger(1);
        Map<String, Integer> collect = list.stream().collect(Collectors.groupingBy(s -> s.name,
                Collectors.summingInt(s -> s.marks)));

        collect.entrySet().stream().sorted((s1, s2) -> s2.getValue() - s1.getValue()).forEach(s -> {
            System.out.println(s.getKey() + " rank:: " + count);
            count.getAndIncrement();
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


