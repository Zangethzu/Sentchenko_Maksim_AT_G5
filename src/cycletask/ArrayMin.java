package cycletask;

public class ArrayMin {

    public void minArray() {
        int a[] = {1, 2, 3, 6, 12, 24, 48,};
        int min = a[0];
        for (int i = 0; i < 1; i++) {
            if (a[i] < min)
                min = a[i];
            System.out.print(min + " ");
        }
        System.out.println("< -  Минимальный элемент массива ");
    }
}


