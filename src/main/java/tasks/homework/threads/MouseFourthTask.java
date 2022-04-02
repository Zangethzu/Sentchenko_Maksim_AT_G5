package main.java.tasks.homework.threads;

import java.util.ArrayList;
import java.util.List;

public class MouseFourthTask {

    //              1.4
//            - в главном потоке создать коллекцию из 280 мышей
//            - создать 5 дочерних потоков, в каждом из которых:
//            - каджые 300мс удалять 1 пикающую мышь
//            - запустить потоки
    public static void main(String[] args) {

        List<Mouse> list = getMices();

        for (int i = 0; i < 5; i++) {
            int finalI = i;
            new Thread(() ->
            {
                System.out.println("Start Thread " + finalI);
                while (list.size() > 0) MouseFourthTask.deleteMouse(list);
                System.out.println("Finish Thread " + finalI);
            }).start();
        }

//        new Thread(() ->
//        {
//            System.out.println("Start 1 Thread");
//            while (list.size() > 0) MouseFourthTask.deleteMouse(list);
//            System.out.println("Finish 1 Thread");
//        }).start();
//        new Thread(() ->
//        {
//            System.out.println("Start 2 Thread");
//            while (list.size() > 0) MouseFourthTask.deleteMouse(list);
//            System.out.println("Finish 2 Thread");
//        }).start();
//        new Thread(() ->
//        {
//            System.out.println("Start 3 Thread");
//            while (list.size() > 0) MouseFourthTask.deleteMouse(list);
//            System.out.println("Finish 3 Thread");
//        }).start();
//        new Thread(() ->
//        {
//            System.out.println("Start 4 Thread");
//            while (list.size() > 0) MouseFourthTask.deleteMouse(list);
//            System.out.println("Finish 4 Thread");
//        }).start();
//        new Thread(() ->
//        {
//            System.out.println("Start 5 Thread");
//            while (list.size() > 0) MouseFourthTask.deleteMouse(list);
//            System.out.println("Finish 5 Thread");
//        }).start();
    }

    public static synchronized void deleteMouse(List<Mouse> list) {
        try {
            if (list.size() == 0) {
                return;
            }
            Mouse m = list.get(0);
            m.onlyPeep();
            Thread.sleep(300);
            list.remove(m);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static List<Mouse> getMices() {
        List<Mouse> mouseList = new ArrayList<>();
        for (int k = 0; k < 281; k++) {
            mouseList.add(new Mouse(k));
        }
        return mouseList;
    }
}
