package main.java.tasks.homework.threads;

public class Hedgehog {

    private String pattern = "Hedgehog";
    private String name;

    public Hedgehog(String number) {
        this.name = String.format(pattern,number);
    }

public void tellMe(){
    System.out.println(String.format("I am %s \n", this.name));
    try {
        Thread.sleep(50);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
}
