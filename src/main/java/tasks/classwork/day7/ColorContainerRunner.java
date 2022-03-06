package main.java.tasks.classwork.day7;

public class ColorContainerRunner {

    public static void main(String[] args) {
    }


    static void printColorHex(String color) {
        switch (color) {
            case "red":
                System.out.println(ColorContainer.RED.getColor());
                break;
        }
    }

    public void ifcolor(int color) {
        switch (color) {
            case 1:
                System.out.println(ColorContainer.RED.getColor());
                break;
        }
    }

}
