package main.java.tasks.homework.lists;

import java.util.Arrays;
import java.util.List;

public class MyBirds {

    //private static final String DASH = "-" + "--";

    public static void main(String[] args) {

        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        // String value = "";
        for (String bird : birds) {
           /* if(value.equals("")){
                value = bird;
            }else {
                value = String.join(DASH,value,bird);
            }*/
            System.out.print("-" + bird + "--" + " ");
        }

//Посчитать сколько птиц содержат больше 1 гласной и вывести в число в консоль
        int counter = 0;
        for (String bird : birds) {
           /* if (bird.contains("ё") || bird.contains("у") || bird.contains("е") || bird.contains("а")
                    || bird.contains("о") || bird.contains("э") || bird.contains("я") && bird.contains("и") || bird.contains("ю")) {
                counter++;*/
            String replaced = bird.replaceAll("[ёуеыаоэяию]", "");
            if ((replaced.length() < bird.length() && replaced.length() != bird.length() - 1)) {
                counter++;
            }
        }
        System.out.println(counter);


        birds.set(3, "Синица");

        for (String bird : birds) {
            System.out.println(bird);
        }
    }
}
