package main.java.tasks.classwork.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClassStream8 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "рамув","мама");

        String u = list.stream().collect(Collectors.joining(":","<p>","</p>"));
        System.out.println(u);

        List<Person> mine = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMAN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMAN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        mine.stream().collect(Collectors.toMap(Object::hashCode, x -> x));
        mine.stream().collect(Collectors.groupingBy(x -> x.sex)).keySet().forEach(System.out::println);
    }
}
