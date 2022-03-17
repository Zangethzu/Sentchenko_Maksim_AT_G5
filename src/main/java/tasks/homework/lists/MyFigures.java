package main.java.tasks.homework.lists;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

//      Создать список строк figures из 5 фигур (Овал, Прямоугольник, Круг, Квадрат, Эллипс) через (Arrays.asList())
//        Проитерировать список через for-each и отпечатать слова в в файл figures через тире
//        Посчитать сколько фигур НЕ содержат букву "и" и вывести число в консоль
//        Проитерировать список по индексу и отпечатать слова в консоль через пробел
//        Вставить на 3 позицию Треугольник
//        Проитерировать список через for-each и отпечатать слова в консоль через пробел
public class MyFigures {

    private static final String DASH = "-";

    public static void main(String[] args) throws IOException {

        String str = "";
        BufferedWriter out = new BufferedWriter(new FileWriter("D://Sentchenko_Maksim_AT_G5/lol.txt"));

        List<String> figures =
                Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");
        for (String figure : figures) {
            if (str.equals("")) {
                str = figure;
            } else {
                str = String.join(DASH, str, figure);
            }

        }
        out.write(str);
        out.close();

        int value = 0;
        for (String figure : figures) {
            if (!figure.contains("и")) {
                value++;
            }
        }
        System.out.println(value);

        for (int figure = 0; figure < figures.size(); figure++) {
            System.out.println(figures.get(figure) + " ");
        }

        figures.set(2, "Треугольник"); //почему если пишу 3, то в выводе он стоит четвертым?

        for (String figure : figures) {
            System.out.println(figure);
        }
    }
}
