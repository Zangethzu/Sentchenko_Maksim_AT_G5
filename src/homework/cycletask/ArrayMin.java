package cycletask;

public class ArrayMin {

    public void minArray() {
        int[] array = {1, 2, 3, 6, 12, 24, 48,};
        int min = array[0];
        for (int i = 0; i < 1; i++) {
            if (array[i] < min)
                min = array[i];
            System.out.print(min + " ");
        }
        System.out.println("< -  Минимальный элемент массива ");
    }
}


