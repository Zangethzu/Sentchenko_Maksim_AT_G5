package main.java.tasks.homework.threads;

import java.util.ArrayList;
import java.util.List;

public class MouseFifthTask {

    public static void main(String[] args) {

        List<Mouse> list = getMices();


        for (int i = 0; i < 7; i++) {
            int finalI = i;
            new Thread(() ->
            {
                System.out.println("Start Thread " + finalI);
                while (list.size() > 0) MouseFourthTask.deleteMouse(list);
                System.out.println("Finish Thread " + finalI);
            }).start();
        }
    }

    public static List<Mouse> getMices() {
        List<Mouse> mouseList = new ArrayList<>();
        for (int k = 0; k < 381; k++) {
            mouseList.add(new Mouse(k));
        }
        return mouseList;
    }

    public static synchronized void deleteMouse(List<Mouse> list) {
        try {
            if (list.size() == 0) {
                return;
            }
            Mouse m = list.get(0);
            m.onlyPeep();
            Thread.sleep(250);
            list.remove(m);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
