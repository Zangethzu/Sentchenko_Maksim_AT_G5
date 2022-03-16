package main.java.tasks.classwork.day9;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

    public static void main(String[] args) {

        String [] str1 = "мама мыла раму".split(" ");
        Map<Integer,String> words = new HashMap<>();

        for (int i = 0; i < str1.length; i++){
           words.put(i,str1[i]);
        }
        for (String i : words.values()){
            System.out.println(i);
        }
        System.out.println();

        for(Map.Entry<Integer,String> entry: words.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
