package main.java.tasks.homework.stringtask;

import java.util.Objects;

public class Strings {

    public static void main(String[] args) {

        String string = "Big black bug bit a big black dog on his big black nose";
        int count;

        //Преобразуем строку в нижний регистр
        string = string.toLowerCase();

        //Разбиваем строку на слова
        String words[] = string.split(" ");

        System.out.println("Duplicate words in a given string : ");
        for(int i = 0; i < words.length; i++) {
            count = 1;
            for(int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                    //Присваеваем words [j] в 0, чтобы не печатать посещенное слово
                    words[j] = "0";
                }
            }

            //Отобрабразить повторяющееся слово, если количество больше 1
            if(count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
    }
}