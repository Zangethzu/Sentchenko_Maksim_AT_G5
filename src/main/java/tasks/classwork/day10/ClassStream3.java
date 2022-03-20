package main.java.tasks.classwork.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClassStream3 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму","мама");

        System.out.println(list.stream().anyMatch("мама"::equals));
        System.out.println(list.stream().allMatch("м"::contains));
        System.out.println(list.stream().map(x -> x +"м").collect(Collectors.toList()));
        list.stream().map(x -> x +"м" + " ").forEach(System.out::println);
        list.stream().flatMap(x -> Arrays.stream(x.split("а"))).filter(x -> !x.equals("")).collect(Collectors.toList()).forEach(System.out::print);
    }
}
