package main.java.tasks.homework.string;

public class Person {

    String name;
    String surname;
    int age;

    public Person(String name, String surname, int age){
        this.age = age;
        this.name = name;
        this.surname = surname;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
    return name;
    }

    public String getSurname() {
        return surname;
    }
}
