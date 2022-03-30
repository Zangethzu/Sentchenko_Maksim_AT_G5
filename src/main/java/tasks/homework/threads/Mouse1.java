//package main.java.tasks.homework.threads;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Mouse1 {
//
//    public static void main(String[] args) {
//
//        int numberThreads = 5;
//        for (int num = 0; num < numberThreads; num++) {
//            Thread thread = new Thread(() -> {
//                List<Mouse> mouses = new ArrayList<>();
//                for (int i = 0; i < 21; i++) {
//                    Mouse mouse = new Mouse(i);
//                    mouses.add(mouse);
//                }
//                mouses.forEach(p -> p.peep(1000));
//            });
//            thread.start();
//        }
//    }
//}
