package main.java.tasks.homework.threads;

import java.util.ArrayList;
import java.util.List;

public class MouseThirdTask {

    public static void main(String[] args) {

        new Thread(MouseThirdTask::subZero).start();
        new Thread(MouseThirdTask::shaoKan).start();
        new Thread(MouseThirdTask::goro).start();
        new Thread(MouseThirdTask::scorpion).start();
        new Thread(MouseThirdTask::jarek).start();
        new Thread(MouseThirdTask::jade).start();
        new Thread(MouseThirdTask::sonya).start();
    }

    static void subZero() {
        List<Mouse> krisky = new ArrayList<>();
        for (int k = 0; k < 27; k++) {
            Mouse mouse = new Mouse(k);
            if (k % 2 == 1) {
                krisky.add(mouse);
            }
        }
        krisky.forEach(Mouse::peep);
    }

    static void shaoKan() {
        List<Mouse> krisky = new ArrayList<>();
        for (int k = 0; k < 27; k++) {
            Mouse mouse = new Mouse(k);
            if (k % 2 == 1) {
                krisky.add(mouse);
            }
        }
        krisky.forEach(Mouse::peep);
    }

    static void goro() {
        List<Mouse> krisky = new ArrayList<>();
        for (int k = 0; k < 27; k++) {
            Mouse mouse = new Mouse(k);
            if (k % 2 == 1) {
                krisky.add(mouse);
            }
        }
        krisky.forEach(Mouse::peep);
    }

    static void scorpion() {
        List<Mouse> krisky = new ArrayList<>();
        for (int k = 0; k < 27; k++) {
            Mouse mouse = new Mouse(k);
            if (k % 2 == 1) {
                krisky.add(mouse);
            }
        }
        krisky.forEach(Mouse::peep);
    }

    static void jarek() {
        List<Mouse> krisky = new ArrayList<>();
        for (int k = 0; k < 27; k++) {
            Mouse mouse = new Mouse(k);
            if (k % 2 == 1) {
                krisky.add(mouse);
            }
        }
        krisky.forEach(Mouse::peep);
    }

    static void jade() {
        List<Mouse> krisky = new ArrayList<>();
        for (int k = 0; k < 27; k++) {
            Mouse mouse = new Mouse(k);
            if (k % 2 == 1) {
                krisky.add(mouse);
            }
        }
        krisky.forEach(Mouse::peep);
    }

    static void sonya() {
        List<Mouse> krisky = new ArrayList<>();
        for (int k = 0; k < 27; k++) {
            Mouse mouse = new Mouse(k);
            if (k % 2 == 1) {
                krisky.add(mouse);
            }
        }
        krisky.forEach(Mouse::peep);
    }

}
