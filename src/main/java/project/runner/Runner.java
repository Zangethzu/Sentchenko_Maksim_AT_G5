package main.java.project.runner;

import main.java.project.boxing.Bottle;

public class Runner {

    public static void main(String[] args) {

        Bottle bottle = new Bottle(0.5);
        Bottle bottle1 = new Bottle(1);
        Bottle bottle2 = new Bottle(1.5);


        bottle.open();
        bottle1.open();
        bottle2.open();
    }
}
