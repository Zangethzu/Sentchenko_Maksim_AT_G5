package main.java.tasks.classwork.day8;

import java.util.Scanner;

public class ConsoleReader {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            System.out.printf("Just got '%s' text!", incoming); //вывод дополниттельных слов при вводу в коноль
            if("lol".equalsIgnoreCase(incoming));{ //при вводе слова lol выполнение процесса в консоли приостанавливается
            break;}
        }
    }
}
