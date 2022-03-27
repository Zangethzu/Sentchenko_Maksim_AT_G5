package main.java.tasks.classwork.day12;

import main.java.tasks.classwork.day11.ThreadDemo;

import static main.java.tasks.classwork.day11.ThreadDemo.heavyMethod;

public class ThreadDemo3 {

    public static void main(String[] args) {

        Thread t1 = new Thread(ThreadDemo::heavyMethod);

        Thread t2 = new Thread(ThreadDemo::heavyMethod);

        Thread t3 = new Thread(() -> {
            try{
                t1.join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            heavyMethod();
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
