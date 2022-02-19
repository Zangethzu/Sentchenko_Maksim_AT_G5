package basetask;

public class TrainMethodsStringRunner {

    public static void main(String[] args) {
        TrainMethodsString trainMethodsString = new TrainMethodsString("arg1");
        trainMethodsString.printMama();
        trainMethodsString.printPapa();
        trainMethodsString.printString("моем окна");
        trainMethodsString.printMamaString("окна помыты");


        TrainMethodsString trainMethodsString2 = new TrainMethodsString("arg2");
        trainMethodsString2.printMama();
        trainMethodsString2.printArg();
        trainMethodsString.printArg();
    }
}

