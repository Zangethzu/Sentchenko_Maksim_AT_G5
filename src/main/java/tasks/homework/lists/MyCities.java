package main.java.tasks.homework.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyCities {

    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Минск", "Москва", "Берлин");
        for (String city : cities) {
            System.out.println(city);
        }

        int count = 0;
        for (String city : cities) {
            count += city.length();
        }
        System.out.println(count);

        for (int city = 0; city < cities.size(); city++) {
            System.out.print(cities.get(city) + " ");
        }
    }
}
