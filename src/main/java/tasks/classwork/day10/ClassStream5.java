package main.java.tasks.classwork.day10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ClassStream5 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму","мама");

        System.out.println(list.stream().flatMap(x -> Arrays.stream(x.split(""))).peek(System.out::println).max(String::compareTo));

        List<Person> mine = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMAN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMAN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        System.out.println(mine.stream().min(Comparator.comparing(p -> p.age)));
    }
}
