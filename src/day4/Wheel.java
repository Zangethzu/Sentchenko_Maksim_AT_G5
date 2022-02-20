package day4;

public class Wheel {

    private int diametr;
    private String type;

    public Wheel(int diametr, String type) {
        this.diametr = diametr;
        this.type = type;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "diametr=" + diametr +
                ", type='" + type + '\'' +
                '}';
    }
}
