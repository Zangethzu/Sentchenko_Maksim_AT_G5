package main.java.tasks.classwork.day9;

import java.util.ArrayList;
import java.util.List;

public class MyNames {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Оля");
        names.add("Коля");
        names.add("Аня");
        names.add("Миша");
        names.add("Юля");
        for (String i : names) {
            System.out.println(i + " ");
        }
        names.set(2, "Оля");
        names.set(4, "Катя");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " ");
        }
        names.remove("Оля");
        names.remove(3);
        for(String i : names){
            System.out.println(i + " ");
        }
    }
}
