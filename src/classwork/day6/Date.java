package classwork.day6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {

    public static void main(String[] args) throws ParseException {

        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy"); //задаем шаблон по которому вывдаем дату

        java.util.Date date = dateFormat.parse("04.06.2012"); // записываем дату

        String text = dateFormat.format(new java.util.Date());


        System.out.println(text);
    }
}
