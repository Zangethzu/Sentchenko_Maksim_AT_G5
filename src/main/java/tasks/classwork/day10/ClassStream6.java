package main.java.tasks.classwork.day10;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ClassStream6 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму","мама");

        System.out.println(list.stream().flatMap(s -> Arrays.stream(s.split(""))).count());

        Optional<Integer> x = list.stream().map(String::length).reduce(Integer::sum);
        System.out.println(x);

       int y = list.stream().mapToInt(String::length).sum();
        System.out.println(y);
    }
}
