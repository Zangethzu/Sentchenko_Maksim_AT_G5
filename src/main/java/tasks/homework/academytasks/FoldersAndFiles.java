package main.java.tasks.homework.academytasks;

import java.io.File;

public class FoldersAndFiles {
    public static void main(String[] args) {

        File directory = new File("D://Sentchenko_Maksim_AT_G5");
        if (directory.isDirectory()){

            for (File item : directory.listFiles()){

                if(item.isDirectory()){
                    System.out.println(item.getName() + "  \t folder");
                }
                else {
                    System.out.println(item.getName() + "\t file");
                }
            }
        }
    }
}
