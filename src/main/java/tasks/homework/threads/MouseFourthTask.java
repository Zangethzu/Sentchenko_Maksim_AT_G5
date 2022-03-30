package main.java.tasks.homework.threads;

import java.util.ArrayList;
import java.util.List;

public class MouseFourthTask {

    public static void main(String[] args) {

        Thread main = new Thread(MouseFourthTask::numberMice);
        main.start();
        System.out.println();

    }

    static void numberMice() {
        List<Mouse> krisky = new ArrayList<>();
        for (int k = 0; k < 281; k++) {
            krisky.add(new Mouse(k));
        }
    }

        new Thread(MouseThirdTask::perviy).start();
        new Thread(MouseThirdTask::vtoroy).start();
        new Thread(MouseThirdTask::tretiy).start();
        new Thread(MouseThirdTask::chetvertyi).start();
        new Thread(MouseThirdTask::pyatyi).start();

    public static void perviy(List<Mouse> krisky) {
        while (krisky.size() > 0) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
