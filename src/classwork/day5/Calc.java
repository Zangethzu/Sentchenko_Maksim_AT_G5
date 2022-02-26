package classwork.day5;

public class Calc {

    public  int calculate (String action, int x, int y){
        switch (action){
            case "+":
                return add(x,y);
            case "-":
                return subract(x,y);
            case "*":
                return multiply(x,y);
            case "/":
                return devide(x,y);
            default:
                return 0;
        }
    }

    private int add(int x, int y) {
        return x + y;
    }

    private int subract(int x, int y) {
        return x - y;
    }

    private int multiply(int x, int y) {
        return x * y;
    }

    private int devide(int x, int y) {
        return x / y;
    }



}
