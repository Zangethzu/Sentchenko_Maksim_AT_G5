package main.java.tasks.classwork.day12;

import main.java.tasks.classwork.day11.ThreadDemo;

public class ThreadDemo4 {

    public static void main(String[] args) {

        Thread t1 = new Thread(ThreadDemo::heavyMethod);

        Thread t2 = new Thread(ThreadDemo::heavyMethod);

        Thread t3 = new Thread(ThreadDemo::heavyMethod);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
