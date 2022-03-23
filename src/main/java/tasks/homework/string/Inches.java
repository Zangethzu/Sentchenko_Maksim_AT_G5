package main.java.tasks.homework.string;

import java.util.stream.IntStream;

public class Inches {

    public static void main(String[] args) {

        System.out.println(IntStream.range(1,20).filter(x -> x%2 ==0).mapToDouble(x -> x*2.54).sum());
    }
}
