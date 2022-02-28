package main.java.tasks.homework.cycletask;

public class MultipliedArray {
    public void arrayback() {
        int[] array = {1, 2, 3, 6, 12, 24, 48,};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] * 5 + " ");
        }
        System.out.println("< - Вывод чисел массива умноженные на 5");
    }
}
