package cycletask;

public class ArrayReverse {

    public void reverseArray() {
        int a[] = {1, 2, 3, 6, 12, 24, 48,};
        int reverse = a[0];
        a[0] = a[a.length - 1];
        a[a.length - 1] = reverse;
        System.out.print(a[0] + " < - (На самом деле это последний элемент)" + " ");
        System.out.print(a[6] + " < - (А это первый)");
        System.out.println(" < -  Это первый и последний элементы массивы reverse между собой");

    }
}




