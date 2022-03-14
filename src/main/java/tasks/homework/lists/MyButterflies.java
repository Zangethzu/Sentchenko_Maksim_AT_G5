package main.java.tasks.homework.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Создать пустой список butterflies (через нью)
// Добавить в список 4 бабочек (Common blue, Swallowtail, Aglais io, Common blue)
// Проитерировать список через for-each и отпечатать слова в консоль в кавычках
// Посчитать сколько бабочек содержат букву "о" и вывести число в консоль
// Проитерировать список по индексу и отпечатать слова в консоль через пробел
// Проитерировать список через for-each и отпечатать слова в консоль через перенос строки
public class MyButterflies {

    public static void main(String[] args) {

        List<String> myButterflyes =
                Arrays.asList("'Common blue'", "'Swallowtail'", "'Aglais io'", "'Common blue'" + "\n" + "\n");
        for (String i : myButterflyes) {
            System.out.print(i);
        }
        int value = 0;
        for (String i : myButterflyes) {
            if (i.contains("o")) ;
            {
                value++;
            }
        }
        System.out.println("Количество слов содержащих 'O' = " + value);

        for (int i = 0; i < myButterflyes.size(); i++) {
            System.out.println(myButterflyes.get(i));
        }

        for (String i : myButterflyes) {
            System.out.println(i);
        }

//        newDemo();
    }

    public static void newDemo() {
        List<String> myButterflyes = new ArrayList<>(Arrays.asList("Common blue", "Swallowtail", "Aglais io", "Common blue")); //как вариант можно запихнуть сюда то что было написано ниже.
        //myButterflyes.addAll(
        // Arrays.asList("Common blue", "Swallowtail", "Aglais io", "Common blue"));
        for (String i : myButterflyes) {
            System.out.println(i);
        }
    }
}