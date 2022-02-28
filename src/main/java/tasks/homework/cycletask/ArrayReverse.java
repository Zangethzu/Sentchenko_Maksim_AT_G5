package main.java.tasks.homework.cycletask;

public class ArrayReverse {

    public void reverseArray() {
        int[] array = {1, 2, 3, 6, 12, 24, 48,};
        int reverse = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = reverse;
        System.out.print(array[0] + " < - (На самом деле это последний элемент)" + " ");
        System.out.print(array[6] + " < - (А это первый)");
        System.out.println(" < -  Это первый и последний элементы массивы reverse между собой");

    }
}




