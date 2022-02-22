package homework.basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf trainMethodsIf = new TrainMethodsIf();
        int x = trainMethodsIf.returnNewInt(4);
        System.out.println("метод <returnNewInt> вернул " + x);
        long c = trainMethodsIf.returnNewLong(100);
        System.out.println("метод <returnNewLong> вернул " + c);
        char v = trainMethodsIf.returnNewChar('g');
        System.out.println("метод <returnNewChar> вернул " + v);
        float b = trainMethodsIf.returnNewFloat(5f);
        System.out.println("метод <returnNewFloat> вернул " + b);
        double n = trainMethodsIf.returnNewDouble(300);
        System.out.println("метод <returnNewFloat> вернул " + n);
        trainMethodsIf.returnNewBoolean(5 > 10);

    }
}
