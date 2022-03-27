package main.java.tasks.classwork.day11;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class ThreadDemo {

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();

        for (int i = 0; i< 5; i++){
            heavyMethod();
        }
    }
    public static void heavyMethod () {
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            double d = tan(atan(123456789.123456789));
        }

        System.out.printf("I am %s, and I have finished in %s millis \r\n",
                Thread.currentThread().getName(),
                (System.currentTimeMillis() - t0));
    }
}
