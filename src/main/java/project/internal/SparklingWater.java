package main.java.project.internal;

public class SparklingWater extends Water {

    Bubble[] bubbles;


    public SparklingWater(String color, String transparency, String smell, int temperature) {
        super(color, transparency, smell, temperature);
    }

    public void setBubbles(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }
    public Bubble[] getBubbles() {
        return bubbles;
    }
//метод pump который заполняет массив пузырьками
    public void pump(){
        for (int i = 0; i < bubbles.length; i++){
            this.bubbles[i] = new Bubble();
        }
    }
    //метод degas который лопает пузырьки
    public void degas(){
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i].cramp();
        }

    }

}


