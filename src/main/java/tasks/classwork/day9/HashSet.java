package main.java.tasks.classwork.day9;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSet {

    public static void main(String[] args) {

        Set<String> input = new java.util.HashSet<>();
        Set<String> input2 = new TreeSet<>();
        String[] output = "Я люблю печенье".split(" ");
        long x = System.currentTimeMillis(); // задаю переменку х = которая отсчитывает время
        for (int b = 0; b < 100000000; b++) { // задаю количество выполнение интераций (итерирую)
            input.add("lollol");// заполняю элементами
        }
        System.out.println(System.currentTimeMillis() - x);
        x = System.currentTimeMillis(); //ресетаю время которое засекаю
        for (int n = 0; n < 100000000; n++) {
            input2.add("kekekek");
        }
        System.out.println(System.currentTimeMillis() - x);
    }

}


