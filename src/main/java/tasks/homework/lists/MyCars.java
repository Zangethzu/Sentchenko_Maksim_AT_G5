package main.java.tasks.homework.lists;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyCars {

    public static void main(String[] args) throws IOException {


        BufferedWriter out = new BufferedWriter(new FileWriter("D://Sentchenko_Maksim_AT_G5/cars.txt"));
        Set<String> cars = new HashSet<>();

        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        for (String car : cars) {
            out.write(car);
            out.newLine();
        }
        out.close();

        Iterator<String> iterator = cars.iterator();
//Найти и удалить из набора авто, в названии которых больше 4 букв
        while (iterator.hasNext()) {
            if (iterator.next().length() > 4) {
                iterator.remove();
            }
        }

//Проитерировать список через for-each и отпечатать слова в консоль через пробел
        for (String car : cars) {
            System.out.println(car);

        }
    }
}
