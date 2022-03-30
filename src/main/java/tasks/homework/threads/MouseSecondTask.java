package main.java.tasks.homework.threads;

import java.util.ArrayList;
import java.util.List;

public class MouseSecondTask {

    public static void main(String[] args) {

        new Thread(MouseSecondTask::don).start();
        new Thread(MouseSecondTask::vtoroyDon).start();
        new Thread(MouseSecondTask::ahmatDon).start();
        new Thread(MouseSecondTask::silaDon).start();
        new Thread(MouseSecondTask::izvinisDon).start();
        new Thread(MouseSecondTask::borodaDon).start();
        new Thread(MouseSecondTask::lastDon).start();
    }

    static void don() {
        List<Mouse> krisky = new ArrayList<>();
        for (int k = 0; k < 19; k++) {
            Mouse mouse = new Mouse(k);
            if (k % 2 == 0) {
                krisky.add(mouse);
            }
        }
        krisky.forEach(p -> p.peep());
    }

    static void vtoroyDon() {
        List<Mouse> krisky = new ArrayList<>();
        for (int k = 0; k < 19; k++) {
            Mouse mouse = new Mouse(k);
            if (k % 2 == 0) {
                krisky.add(mouse);
            }
        }
        krisky.forEach(p -> p.peep());
    }

    static void ahmatDon() {
        List<Mouse> krisky = new ArrayList<>();
        for (int k = 0; k < 19; k++) {
            Mouse mouse = new Mouse(k);
            if (k % 2 == 0) {
                krisky.add(mouse);
            }
        }
        krisky.forEach(p -> p.peep());
    }

    static void silaDon() {
        List<Mouse> krisky = new ArrayList<>();
        for (int k = 0; k < 19; k++) {
            Mouse mouse = new Mouse(k);
            if (k % 2 == 0) {
                krisky.add(mouse);
            }
        }
        krisky.forEach(p -> p.peep());
    }

    static void izvinisDon() {
        List<Mouse> krisky = new ArrayList<>();
        for (int k = 0; k < 19; k++) {
            Mouse mouse = new Mouse(k);
            if (k % 2 == 0) {
                krisky.add(mouse);
            }
        }
        krisky.forEach(p -> p.peep());
    }

    static void borodaDon() {
        List<Mouse> krisky = new ArrayList<>();
        for (int k = 0; k < 19; k++) {
            Mouse mouse = new Mouse(k);
            if (k % 2 == 0) {
                krisky.add(mouse);
            }
        }
        krisky.forEach(p -> p.peep());
    }

    static void lastDon() {
        List<Mouse> krisky = new ArrayList<>();
        for (int k = 0; k < 19; k++) {
            Mouse mouse = new Mouse(k);
            if (k % 2 == 0) {
                krisky.add(mouse);
            }
        }
        krisky.forEach(p -> p.peep());
    }

}
