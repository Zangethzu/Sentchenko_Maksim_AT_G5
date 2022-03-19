package main.java.tasks.classwork.day10;

import java.util.Arrays;
import java.util.List;


public class RunnerPerson {
    public static void main(String[] args) {

        List<Person> mine = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMAN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMAN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        int counter = 0;
        for (Person chelovek : mine) {
            if ((chelovek.sex == Person.Sex.MAN && chelovek.age < 60 && chelovek.age > 18) || (chelovek.sex == Person.Sex.WOMAN && chelovek.age > 18 && chelovek.age < 55)) {
                counter++;
            }
        }
        System.out.println(counter);

        System.out.println(mine.stream().filter(p -> p.age >= 18).filter(p -> (p.age < 55) || (p.sex == Person.Sex.MAN && p.age < 60)).count());
    }
}
