package coreJava.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamJavaTest {
    public static void main(String[] args) {
/*
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 4);

        //sort
        List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);

        //distinct
        List<Integer> collect1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect1);

        //sum
        Integer sum = list.stream().reduce(0, (a, b) -> a + b);
        //Integer sum = list.stream().reduce(0, Integer::sum);
        System.out.println("SUM " + sum);

        Map<Integer, Long> ccc = list.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        System.out.println(ccc);

        Integer integer = list.stream().findFirst().get();
        System.out.println(integer);
*/


        Person a = new Person(1, "A");
        Person b = new Person(2, "C");
        Person h = new Person(2, "PP");
        Person i = new Person(2, "QC");
        Person c = new Person(3, "B");
        Person d = new Person(4, "D");
        Person e = new Person(5, "MP");
        Person f = new Person(5, "ML");
        Person g = new Person(5, "MQ");

        List<Person> people = Arrays.asList(a, e, d, b, c);
        Map<String, Integer> collect2 = people.stream().collect(Collectors.toMap(person -> person.getName(), p -> p.getId()));
        System.out.println(collect2);
        List<Person> personSortedById = people.stream().sorted(Comparator.comparing(Person::getId)).collect(Collectors.toList());
        System.out.println("personSortedById");
        System.out.println(personSortedById);


        //Grouping
        List<Person> people1 = Arrays.asList(a, e, d, b, c, f, g, h, i);
        Map<Integer, List<Person>> groupingMap = people1.stream().collect(Collectors.groupingBy(Person::getId));
        System.out.println(groupingMap);


/*        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11, 13);
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        List<Integer> collect = Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers).stream().flatMap(l -> l.stream().map(x -> x + 1))
                .collect(Collectors.toList());
        System.out.println(collect);*/


/*        List<Integer> list = Arrays.asList(1, 1, 1, 3, 8, 8, 3, 0, 9);

        Map<Integer, List<Integer>> collect = list.stream().collect(Collectors.groupingBy(p -> p));
        System.out.println(collect);

        List<Integer> collect1 = collect.entrySet().stream()
                .filter(l -> l.getValue().size() < 2).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect1);

        List<Integer> collect2 = list.stream().filter(j -> Collections.frequency(list, j) < 2).collect(Collectors.toList());
        System.out.println(collect2);

 */

    }

    static class Person {
        public int id;
        public String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" + "id=" + id + ", name='" + name + '\'' + '}';
        }
    }
}

