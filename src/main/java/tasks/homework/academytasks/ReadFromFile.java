package main.java.tasks.homework.academytasks;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {


    public static void main(String[] args) throws FileNotFoundException {

        int countWord = 0;
        try (FileReader reader = new FileReader("D://Sentchenko_Maksim_AT_G5/lol.txt")) {

            Scanner input = new Scanner(new FileReader("D://Sentchenko_Maksim_AT_G5/lol.txt"));

            while (input.hasNextLine()) {
                String[] array = input.nextLine().split(" ");
                countWord = countWord + array.length;
            }
            System.out.println("Количество слов = " + countWord);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
