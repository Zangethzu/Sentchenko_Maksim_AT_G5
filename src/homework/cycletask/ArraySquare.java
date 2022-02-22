package homework.cycletask;

public class ArraySquare {

    public void squareArray() {
        int[] array = {1, 2, 3, 6, 12, 24, 48,};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] * array[i] + " ");
        }
        System.out.println("< - Вывод чисел массива в квадрате");
    }
}
