package basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();
        Mouse mouse = new Mouse("Карл ", 25);
        trainMethodsObjects.processMouse(mouse);
        Souce souce = new Souce("Halapenjo ", "Red ");
        trainMethodsObjects.processSouce(souce);
        Bee bee = new Bee("Pchelina ", 5);
        trainMethodsObjects.processBee(bee);
        Obstacle obstacle = new Obstacle("Warning! You Should read this info! ", "High ");
        trainMethodsObjects.processObstacle(obstacle);
        Pineapple pineapple = new Pineapple("Marocco's", 2400);
        trainMethodsObjects.processPineapple(pineapple);

//        trainMethodsObjects.processMouse(new Mouse("Боб", 23));
    }
}
