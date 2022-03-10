package main.java.tasks.classwork.day8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws InterruptedException, IOException {


//        String x = String.valueOf(123);
//        x = String.join(":", "123", "е"); //склеивает
//        System.out.println(x);
//
//        x = String.format("%s собака лает громко %s %s", " дома", "когда", "никого нет"); //форматирует строку - %s <- регулярка для стринг формата.
//        System.out.printf("%s собака лает громко %s %s", " дома", "когда", "никого нет"); //под капотом стрингФ делает тоже самое что и фтирнг формат.
//
//        System.out.println(x);

        BufferedWriter out = new BufferedWriter(new FileWriter("new_file.txt")); // проверяем что в файле мы не можем ничего сделат ьпока не закрыли поток. (out close). Когда поток закроется или мы остановим выполнение в файл можно будет сохранить то что нужно.
        out.write("мама мыла раму");

        while (true){
            Thread.sleep(1000);
        }

    }
}
