package main.java.tasks.classwork.day10;

import java.util.Arrays;
import java.util.List;

public class ClassStream7 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "рамув","мама");

        int u = list.stream().map(String::length).mapToInt(x -> x%2 == 1 ? x : 0).sum();
        System.out.println(u);
    }
}
