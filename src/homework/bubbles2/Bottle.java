package homework.bubbles2;

public class Bottle {

    public double volume;

  SparklingWater sparklingWater = new SparklingWater("white","clear","no",15);

    public Bottle(double volume){
        this.volume = volume;
        this.sparklingWater.getBubbles(new Bubble[(int) (10000 * volume)]);
    }

    public void open (){sparklingWater.degas();}
}
