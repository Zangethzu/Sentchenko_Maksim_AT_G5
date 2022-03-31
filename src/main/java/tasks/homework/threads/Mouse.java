package main.java.tasks.homework.threads;

public class Mouse {


    private String pattern = "Mouse <%d>";
    private String name;

    public Mouse(int number) {
        this.name = String.format(pattern, number);
    }

    public void peep() {
        System.out.print(String.format("\n"+ "%s PEEP", this.name));
        try {
            Thread.sleep(200);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void onlyPeep() {
        System.out.print(String.format("\n"+ "%s PEEP", this.name));

    }

}
