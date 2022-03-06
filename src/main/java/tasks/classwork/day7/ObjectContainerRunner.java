package main.java.tasks.classwork.day7;

public class ObjectContainerRunner {

    public static void main(String[] args) {
        ObjectContainer objectContainer = new ObjectContainer();
        for (int i = 0; i < 10; i++) {
            objectContainer.add(i);
            objectContainer.add("kekekeke");

        }
        while (!objectContainer.isEmpty()) {
            System.out.println(objectContainer.removeLast());
        }
    }
}
