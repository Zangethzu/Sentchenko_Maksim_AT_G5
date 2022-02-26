package classwork.day4;

public class Runner {
    public static void main(String[] args) {

        Wheel[] wheels = {
                new Wheel(16, "Summer"),
                new Wheel(16, "Summer"),
                new Wheel(16, "Summer"),
                new Wheel(16, "Summer")};

        Car car = new Car("Polo","Red", 100,wheels );
        Car car2 = new Car("Polo","Red", 90,wheels );

        Bike bike = new Bike(300, "Grey");
        Bike bike2 =  new Bike(100,"Red");

        VehicleProcessor vehicleProcessor = new VehicleProcessor();

        vehicleProcessor.processCar(car);
        vehicleProcessor.processCar(car2);

        vehicleProcessor.processBike(bike);
        vehicleProcessor.processBike(bike2);

    }
}
