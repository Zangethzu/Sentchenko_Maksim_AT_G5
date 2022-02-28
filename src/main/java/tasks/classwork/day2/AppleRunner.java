package main.java.tasks.classwork.day2;

public class AppleRunner {

    public static void main(String[] args) {

        Apple apple = new Apple();
        Apple apple2 = new Apple("Green", "Sour", 50, 2);


        apple.setColor("Yellow");
        apple.setTaste("Sweet");
        apple.setWeight(100);


        System.out.println(apple);
        System.out.println(apple2);


        System.out.println("Apple color:" + apple2.getColor());

    }

}
