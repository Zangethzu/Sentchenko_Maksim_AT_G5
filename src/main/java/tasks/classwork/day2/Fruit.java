package main.java.tasks.classwork.day2;

public class Fruit {

    private int Sugar;
    private String name;

    public Fruit(int sugar, String name) {
        Sugar = sugar;
        this.name = name;
    }

    public int getSugar() {
        return Sugar;
    }

    public void setSugar(int sugar) {
        Sugar = sugar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
