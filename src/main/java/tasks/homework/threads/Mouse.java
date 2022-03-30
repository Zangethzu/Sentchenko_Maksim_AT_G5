package main.java.tasks.homework.threads;

public class Mouse {


    private String pattern = "Mouse";
    private String name;
    int n;

    public Mouse(int n) {
        this.n = n;
    }


    public void peep() {
        System.out.println("Mouse " + "<n>" + "PEEP!");
        try {
            Thread.sleep(200);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
