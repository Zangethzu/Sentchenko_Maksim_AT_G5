package main.java.tasks.homework.cycletask;

public class ArrayOverse {
    public void arrayback() {
        int[] array = {1, 3, -7, 2, 8, 23, 21,};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("< - Вывод чисел массива в обратном порядке");
    }
}
