package cycletask;

public class MultipliedArray {
    public void arrayback() {
        int a[] = {1, 2, 3, 6, 12, 24, 48,};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] * 5 + " ");
        }
        System.out.println("< - Вывод чисел массива умноженные на 5");
    }
}
