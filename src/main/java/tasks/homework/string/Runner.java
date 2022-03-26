package main.java.tasks.homework.string;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Runner {

    public static void main(String[] args) {

        List<String> persons = IntStream.rangeClosed(1, 100).boxed()
                .map(i -> new Person("Name" + i, "Surname" + i, ThreadLocalRandom.current()
                        .nextInt(15,30) )).filter(p -> p.getAge() < 21)
                .peek(person -> System.out.println(person.getName() + " " + person.getAge()))
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                .limit(4).map(Person::getName).collect(Collectors.toList());

        System.out.println(persons);
    }
}
