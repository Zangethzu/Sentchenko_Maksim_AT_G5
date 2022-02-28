package main.java.tasks.homework.cycletask;

public class CycleTaskRunner {

    public static void main(String[] args) {
        WhileNumbers whileNumbers = new WhileNumbers();
        whileNumbers.Alfa();

        ForNechetNumbers forNechetNumbers = new ForNechetNumbers();
        forNechetNumbers.nechetNumbers();

        Massive massive = new Massive();
        massive.massivka();

        ArrayOverse arrayOverse = new ArrayOverse();
        arrayOverse.arrayback();

        MultipliedArray multipliedArray = new MultipliedArray();
        multipliedArray.arrayback();

        ArraySquare arraySquare = new ArraySquare();
        arraySquare.squareArray();

        ArrayMin arrayMin = new ArrayMin();
        arrayMin.minArray();

        ArrayReverse arrayReverse = new ArrayReverse();
        arrayReverse.reverseArray();

        DecreasingArray decreasingArray = new DecreasingArray();
        decreasingArray.decreaseArray();
    }
}
