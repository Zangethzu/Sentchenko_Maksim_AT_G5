package cycletask;

public class ArrayOverse {
    public void arrayback() {
        int a[] = {1, 3, -7, 2, 8, 23, 21,};
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println("< - Вывод чисел массива в обратном порядке");
    }
}
