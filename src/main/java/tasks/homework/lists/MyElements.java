package main.java.tasks.homework.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyElements {

    public static void main(String[] args) {

        //List<String> elements = Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb").filter(v -> v.length() < 6).collect(Collectors.toList());
        List<String> elements = new ArrayList<>();
        elements.addAll(Arrays.asList("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb"));
        //List<String> elements = Arrays.asList("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");
        for (String element : elements) {
            System.out.print(element + " ");
        }

        int counter = 0;
        for (String element : elements) {
            if (element.contains(" ")) {
                counter++;
            } else if (element.contains("-")) {
                counter++;
            }
        }
        System.out.println(counter);

        for (int element = 0; element < elements.size(); element++) {
            System.out.println(elements.get(element));
        }


        elements.add(3, "Spinner"); // мы должны видеть СПИННЕР на 4 позиции после итерации вывода или нет?
        elements.remove(1);
        elements.set(4, "Switch");

        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}
