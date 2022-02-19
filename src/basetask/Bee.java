package basetask;

public class Bee {
    String gender;
    long weight;

    public Bee(String gender, long weight) {
        setGender(gender);
        setWeight(weight);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public void printBeeDetails() {
        int x = 500;
        System.out.println("Я легче " + getGender() + "в " + 500 / getWeight() + " раз");
    }
}
