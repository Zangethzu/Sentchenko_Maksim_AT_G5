package main.java.tasks.homework.myown;

import java.util.Scanner;
//На вход подаётся натуральное число n. Создайте массив натуральных чисел от единицы до n включительно и выведите его на печать (в одной строке, через пробел).
class MyNumber {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++){
            array[i] = i+1;
            System.out.print(array[i] + " ");
        }
    }
}
