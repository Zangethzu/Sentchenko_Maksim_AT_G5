package classwork.day2;

public class While_demo {

    public static void main(String[] args) {
        int i = 23;
        for (i = 23; i < 28; i++) {
            if (i % 13 == 0) {
                System.out.println("continue!");
                break;
            }
            System.out.println("i is : ");
        }
        System.out.println("number is : " + i);
    }
}
