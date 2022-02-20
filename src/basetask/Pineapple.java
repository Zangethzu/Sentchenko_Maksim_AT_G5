package basetask;

public class Pineapple {
    String grade;
    double heatCapacity;

    public Pineapple(String grade, double heatCapacity) {
        setGrade(grade);
        setHeatCapacity(heatCapacity);

//        this.grade = grade;
//        this.heatCapacity = heatCapacity;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getHeatCapacity() {
        return heatCapacity;
    }

    public void setHeatCapacity(double heatCapacity) {
        this.heatCapacity = heatCapacity;
    }

    public void printPineappleDetails() {
        int x = (int) heatCapacity;
        if (x > 2140) {
            System.out.println("Я ананас, теплоемкость которого больше, чем у " + getGrade());
        } else {
            System.out.println("В " + getGrade() + "тепла запасется больше :(");
        }
    }
}
