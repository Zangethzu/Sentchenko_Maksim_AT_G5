package classwork.day4;

public abstract class Vehicle extends Machinary {

    protected int speed;
    protected String color;

    public Vehicle(int speed, String color) {
        super("Vehicle");
        this.speed = speed;
        this.color = color;
    }

    public int getSpeed() {

        return speed;
    }

    public void setSpeed(int speed) {

        this.speed = speed;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }
}
