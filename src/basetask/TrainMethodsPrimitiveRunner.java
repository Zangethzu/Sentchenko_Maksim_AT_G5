package basetask;

public class TrainMethodsPrimitiveRunner {

    public static void main(String[] args) {

        TrainMethodsPrimitive trainMethodsPrimitive = new TrainMethodsPrimitive();
        trainMethodsPrimitive.printInt(20);
        trainMethodsPrimitive.printLong(100500);
        trainMethodsPrimitive.printChar('a');
        trainMethodsPrimitive.printFloat(5f);
        trainMethodsPrimitive.printDouble(5.112233);
        trainMethodsPrimitive.printShort((short) 5);
        trainMethodsPrimitive.printByte((byte) 2);
        trainMethodsPrimitive.printBoolean(3 < 5);
    }
}
