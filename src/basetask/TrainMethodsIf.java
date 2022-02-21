package basetask;

public class TrainMethodsIf {

    public int returnNewInt(int newInt) {
        int x = newInt;
        if (x < 8) {
            return (x * 7);
        } else {
            return (x / 4);
        }
    }

    public long returnNewLong(int newLong) {
        int c = newLong;
        if (c > 300) {
            return (c - 300);
        } else {
            return (c + 20);
        }
    }

    public char returnNewChar(char newChar) {
        char v = newChar;
        if (v == 'g') {
            return ('g' + 'o');
        } else {
            return (char) ('o' + v);
        }
    }

    public float returnNewFloat(float newFloat) {
        float b = newFloat;
        if (b == (float) 0.67) {
            return (b);
        } else {
            return (b * 2);
        }
    }

    public double returnNewDouble(double newDouble) {
        double n = newDouble;
        if (n > 30 && n < 80) {
            return (n + 87);
        }
        if (n > 80 && n < 400) {
            return (n - 87);
        }
        if (n > 80 && n > 400) {
            return (n / 4);
        } else {
            return (n);
        }
    }

    public void returnNewBoolean(boolean newBoolean) {
        if (newBoolean == true) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }

}
