package homework.basetask;

public class TrainMethodsString {

    private final String arg;

    public TrainMethodsString(String arg) {
        this.arg = arg;
    }

    public void printMama() {

        System.out.println("мама мыла раму" + arg);
    }

    public void printPapa() {

        System.out.println("папа мыла раму");
    }

    public void printString(String value) {
        System.out.println(value);
    }

    public void printMamaString(String value) {
        System.out.println("мама мыла " + value);
    }

    public void printArg() {
        System.out.println(arg);
    }
}
