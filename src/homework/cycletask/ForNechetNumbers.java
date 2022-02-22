package homework.cycletask;

public class ForNechetNumbers {

    public void nechetNumbers() {

        for (int i = 3; i <= 19; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println("< - Нечетные");
    }
}