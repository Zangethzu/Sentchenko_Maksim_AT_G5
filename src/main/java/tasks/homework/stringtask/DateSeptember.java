package main.java.tasks.homework.stringtask;

import java.text.*;
import java.util.Date;
import java.util.Locale;

public class DateSeptember {

    public static void main(String[] args) throws ParseException {

        String goDate = "14:03 05.03.2022"; //передаю стрингу с датой

        SimpleDateFormat myFormat = new SimpleDateFormat("HH:mm dd.MM.yyyy"); //мой формат даты которой я передал
        SimpleDateFormat newFormat = new SimpleDateFormat("MMMM d.MM.yyyy HH:mm", Locale.ENGLISH); //задаю новый формат даты которую хочу
        Date date = myFormat.parse(goDate); //паршу дату которую я задал
        String result = newFormat.format(date);//результат стринги должен быть моиим новый форматом
        System.out.println(result);//принтим

    }
}
