package homework.cycletask;

import java.util.Random;

public class Massive {
    public void massivka() {
        int[] array = new int[7];
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            array[i] = random.nextInt(50);
            System.out.print(array[i] + " ");
        }
        System.out.println("< - Вывод рандомных чисел массива");
    }
}