package main.java.tasks.homework.threads;

import java.util.ArrayList;
import java.util.List;

public class MouseFirstTask {
    public static void main(String[] args) {
        new Thread(MouseFirstTask::lol).start();
        new Thread(MouseFirstTask::kek).start();
        new Thread(MouseFirstTask::cheburek).start();
        new Thread(MouseFirstTask::azaza).start();
        new Thread(MouseFirstTask::rofl).start();
    }

    static void lol() {
        List<Mouse> mouses = new ArrayList<>();
        for (int i = 0; i < 21; i++) {
            Mouse mouse = new Mouse(i);
            mouses.add(mouse);
        }
        mouses.forEach(p -> p.peep());
    }

    static void kek() {
        List<Mouse> mouses = new ArrayList<>();
        for (int i = 0; i < 21; i++) {
            Mouse mouse = new Mouse(i);
            mouses.add(mouse);
        }
        mouses.forEach(p -> p.peep());
    }

    static void cheburek() {
        List<Mouse> mouses = new ArrayList<>();
        for (int i = 0; i < 21; i++) {
            Mouse mouse = new Mouse(i);
            mouses.add(mouse);
        }
        mouses.forEach(p -> p.peep());
    }

    static void azaza() {
        List<Mouse> mouses = new ArrayList<>();
        for (int i = 0; i < 21; i++) {
            Mouse mouse = new Mouse(i);
            mouses.add(mouse);
        }
        mouses.forEach(p -> p.peep());
    }

    static void rofl() {
        List<Mouse> mouses = new ArrayList<>();
        for (int i = 0; i < 21; i++) {
            Mouse mouse = new Mouse(i);
            mouses.add(mouse);
        }
        mouses.forEach(p -> p.peep());
    }
}
