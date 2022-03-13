package main.java.tasks.classwork.day9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoArrayList2 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();// обьявил массив
        List<String> myList2 = new LinkedList<>(); // обьявил массив
        long x = System.currentTimeMillis(); // задаю переменку х = которая отсчитывает время
        for (int b = 0; b < 100000000; b++) { // задаю количество выполнение интераций (итерирую)
            myList.add("lollol");// заполняю элементами
        }
        System.out.println(System.currentTimeMillis() - x); //беру текущее время и выитаю в миллисекундах

        x = System.currentTimeMillis(); //ресетаю время которое засекаю
        for (int n = 0; n < 100000000; n++) {
            myList2.add("kekekek");
        }
        System.out.println(System.currentTimeMillis() - x);
    }
}
