package main.java.tasks.classwork.day7;

import java.util.Locale;

public class EColorRunner {

    public static void main(String[] args) {

        isColor("red");

    }

    private static void isColor(String color) {
        switch (Ecolor.valueOf(color.toUpperCase(Locale.ROOT))) {
            case RED:
                System.out.println(Ecolor.RED.name + ": " + Ecolor.RED.hex);
                break;
            case BLUE:
                System.out.println(Ecolor.BLUE.name + ": " + Ecolor.BLUE.hex);
                break;
        }
    }

}
