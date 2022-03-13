package main.java.tasks.classwork.day9;

import java.util.ArrayList;
import java.util.List;

public class MyVegetables {

    public static void main(String[] args) {

        List<String> vegetables = new ArrayList<>();
        vegetables.add("Помидор");
        vegetables.add("Огурец");
        vegetables.add("Картошка");
        vegetables.add("Морковка");
        vegetables.add("Кабачок");

        for (String i : vegetables) {
            System.out.print(i + " " + ":");
        }

        int value = 0;
        for (String i : vegetables) {
            if (i.contains("а")) {
                value++;
            }
        }
        System.out.println(value);

        vegetables.remove("Огурец");
        vegetables.remove(3);

        for (String i : vegetables) {
            System.out.print(i + " " + ":");
        }
    }
}