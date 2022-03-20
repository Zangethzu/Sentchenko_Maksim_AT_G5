package main.java.tasks.classwork.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClassStream4 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму","мама");

        list.stream().sorted().forEach(System.out::println);
        list.stream().sorted((x,y) -> -x.compareTo(y)).distinct().forEach(System.out::println);

        List<Person> mine = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMAN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMAN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        mine.stream().sorted((p1,p2) -> {//.sorted((p1,p2) -> p1.sex != p2.sex ? p1.sex.compareTo(p2.sex) : p1.age - p2.age.
            if(p1.sex != p2.sex){
                return p1.sex.compareTo(p2.sex);

            }else
                return p1.age - p2.age;
        }).peek(p -> System.out.println(p.name)).collect(Collectors.toList());
    }
}
