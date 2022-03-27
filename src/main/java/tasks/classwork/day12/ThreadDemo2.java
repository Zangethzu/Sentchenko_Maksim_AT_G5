package main.java.tasks.classwork.day12;

import main.java.tasks.classwork.day11.ThreadDemo;

import static main.java.tasks.classwork.day11.ThreadDemo.heavyMethod;

public class ThreadDemo2 {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(ThreadDemo::heavyMethod);

        Thread t2 = new Thread(ThreadDemo::heavyMethod);

        Thread t3 = new Thread(ThreadDemo::heavyMethod);

        t1.start();
        t1.join(); //поток мэйн будет ждать пока отработает первый поток после чего начнут работать 2 и 3 потоки.
        t2.start();
        t3.start();
    }
}
