package main.java.tasks.homework.lists;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyCountries {

    private static final String DASH = ", ";

    public static void main(String[] args) {

        List<String> countries = Arrays.asList("Андора", "Португалия", "Англия", "Замбия");

        String value = "";
        for (String country : countries) {
            if (value.equals("")) {
                value = country;
            } else {
                value = String.join(DASH, value, country);
            }
        }
        System.out.println(value);

        int counter = 0;
        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() > 7) {
                counter++;
            }
        }
        System.out.println(counter);

        for (String country : countries){
            System.out.println(country);
        }
    }
}
