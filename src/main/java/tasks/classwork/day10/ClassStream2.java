package main.java.tasks.classwork.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClassStream2 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму","мама","чисто");
        //long lol = list.stream().filter(x -> x.equals("мама")).count(); Более простой вариант того что написано ниже
        //long lol = list.stream().filter("мама"::equals).count();
        System.out.println(list.stream().findFirst().orElse("мама"));
        System.out.println(list.stream().filter("мама"::equals).findFirst().get());
        System.out.println(list.stream().skip(4).findFirst().get());
        System.out.println(list.stream().skip(2).limit(3).collect(Collectors.toList()));
        System.out.println(list.stream().filter(s -> s.contains("м")).distinct().collect(Collectors.toList()));


        //list.forEach(System.out::println);

    }
}
