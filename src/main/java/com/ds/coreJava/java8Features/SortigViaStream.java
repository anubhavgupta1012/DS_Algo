package com.ds.coreJava.java8Features;

import java.util.*;
import java.util.stream.Collectors;

public class SortigViaStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(6);
        list.add(5);
        list.add(4);

        Person p1 = new Person(1, "AB");
        Person p2 = new Person(2, "AC");
        Person p3 = new Person(3, "DF");
        Person p4 = new Person(4, "BS");
        Person p5 = new Person(5, "BA");

        Set<Person> people = new HashSet<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p5);
        people.add(p4);

        list.sort(Comparator.comparing(Integer::intValue));

        List<Person> collect = people.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(people);
        System.out.println(collect);


    }

    static class Person {
        private int id;
        private String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
