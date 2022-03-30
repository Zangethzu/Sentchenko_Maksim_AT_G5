package main.java.tasks.homework.threads;

public class Mouse {


    private String pattern = "Mouse";
    private String name;

    public Mouse(String number) {
        this.name = String.format(pattern, number);
    }

    public void peep() {
        System.out.println(String.format("Mouse %s + \n", this.name));
        try {
            Thread.sleep(200);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
