package main.java.tasks.classwork.day9;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        String [] str1 = "мама мыла раму".split(" ");
        for (String i : str1){ //для каждой тринги из коллекции стрингов.
            myList.add(i);
        }
        for (String i: myList){
            System.out.println(i);
        }
        for (int i = 0; i < myList.size();i++){
            System.out.println(myList.get(i));
        }
    }
}
