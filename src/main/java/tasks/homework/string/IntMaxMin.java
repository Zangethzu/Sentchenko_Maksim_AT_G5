package main.java.tasks.homework.string;

import java.util.ArrayList;

public class IntMaxMin {
    public static void main(String[] args) {

        int minValue = 1;
        int maxValue = 25;

        ArrayList<Integer> list = new ArrayList(); // Создание коллекции

        for (int i = 1; i < 15; i++) { // Заполнение коллекции последовательностью чисел от 0 до 100
            list.add(i);
        }
        boolean result = list.stream().anyMatch((i -> (i % 3 == 0) && (i % 5 == 0))); // anyMatch Возвращает true, если условие выполняется хотя бы для одного элемента
        System.out.println(result);
    }
}

