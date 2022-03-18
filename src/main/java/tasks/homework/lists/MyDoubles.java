package main.java.tasks.homework.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyDoubles<T> {

    public static void main(String[] args) {

        List<Double> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9));

        for (double number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println(" ");

        double umnozhenie = 1;
        for (Double number : numbers) {
            umnozhenie *= number;
        }
        System.out.println(umnozhenie);

/*найти сумму всех дробных частей и вывести результат в консоль
Проитерировать список по индексу и челые части в консоль через пробел*/

//MyDoubles<Double> n = new MyDoubles<>();
        //      numbers.forEach(n::kek);
    }
    //public void kek(T item){
    //  System.out.print(item + " ");
}

