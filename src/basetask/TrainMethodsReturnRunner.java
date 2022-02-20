package basetask;

public class TrainMethodsReturnRunner {

    public static void main(String[] args) {

        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();
        int x = trainMethodsReturn.returnNewInt(4);
        System.out.println("метод <returnNewInt> вернул " + x);
        int q = (int) trainMethodsReturn.returnNewLong(10);
        System.out.println("метод <returnNewLong> вернул " + q);
        char w = trainMethodsReturn.returnNewChar('a');
        System.out.println("метод <returnNewChar> вернул " + w+w);
        int e = (int) trainMethodsReturn.returnNewFloat(5f);
        System.out.println("метод <returnNewFloat> вернул " + e);
        int r = (int) trainMethodsReturn.returnNewDouble(12);
        System.out.println("метод <returnNewDouble> вернул " + r);
        int t = trainMethodsReturn.returnNewShort((short) 12);
        System.out.println("метод <returnNewShort вернул " + t);
        int y = trainMethodsReturn.returnNewByte((byte) 12);
        System.out.println("метод <returnNewByte> вернул " + y);
        boolean u = trainMethodsReturn.returnNewBoolean(5 > 10);
        System.out.println("метод <returnNewBoolean> вернул " + u);
    }

}
