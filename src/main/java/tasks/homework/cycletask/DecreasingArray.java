package main.java.tasks.homework.cycletask;

public class DecreasingArray {

    public void decreaseArray() {
        int[] array = {2, 7, 6, 3, 0, 1};
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("< -  Отсортированные элементы массива по убыванию");
    }
}
