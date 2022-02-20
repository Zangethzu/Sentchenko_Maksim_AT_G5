package cycletask;

public class ArraySquare {

    public void squareArray() {
        int a[] = {1, 2, 3, 6, 12, 24, 48,};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] * a[i] + " ");
        }
        System.out.println("< - Вывод чисел массива в квадрате");
    }
}
