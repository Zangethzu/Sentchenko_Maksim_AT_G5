package main.java.tasks.classwork.day10;

import java.util.Arrays;
import java.util.List;

public class ClassStream {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму","мама","чисто");
//        long lol = list.stream().filter(x -> x.equals("мама")).count(); Более простой вариант того что написано ниже
        long lol = list.stream().filter("мама"::equals).count();
        System.out.println(lol);
        list.forEach(System.out::println);

    }
}
