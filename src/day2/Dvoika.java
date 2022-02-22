package Day_2;

import java.util.Random;

public class Dvoika {

    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            array[i] = random.nextInt(100);
        }
        int e = 0;
        for (int i : array){
            System.out.println("Average value is: " + i );
            e = i;
        }
        int sum = 0;
        for (int i : array){
            sum += i;

        }

        System.out.println(sum / array.length);

    }
}
