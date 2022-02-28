package homework.bubbles2;

public class SparklingWater extends Water {

    Bubble [] bubbles;


    public SparklingWater(String color, String transparency, String smell, int temperature) {
        super(color, transparency, smell, temperature);
    }

    public Bubble[] getBubbles(Bubble[] bubbles) {
        return this.bubbles;
    }

    public void setBubbles(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void pump(Bubble[] bubbles){
        for (int i = 0; i < bubbles.length; i++){
            this.bubbles[i] = new Bubble();
        }
    }
    public void degas(){
        for (int i = 0; i < bubbles.length; i++) {
            Bubble.cramp(i);
        }
    }
}


