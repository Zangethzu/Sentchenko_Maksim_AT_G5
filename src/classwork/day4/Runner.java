package classwork.day4;

public class Runner {
    public static void main(String[] args) {

        Wheel[] wheels = {
                new Wheel(16, "Summer"),
                new Wheel(16, "Summer"),
                new Wheel(16, "Summer"),
                new Wheel(16, "Summer")};

        Wheel[] bikeWheels = {

                new Wheel(17, "Summer"),
                new Wheel(17, "Summer")};

        Car car = new Car("Polo","Red", 100,wheels );
        Car car2 = new Car("Polo","Red", 90,wheels );

        Bike bike = new Bike(300, "Grey", "Kawasaki",bikeWheels);
        Bike bike2 =  new Bike(100,"Red", "Honda", bikeWheels);

        Boeing boeing = new Boeing("747");

        VehicleProcessor vehicleProcessor = new VehicleProcessor();

        vehicleProcessor.printInfoCar(car);
        vehicleProcessor.printInfoCar(car2);

        vehicleProcessor.printInfoBike(bike);
        vehicleProcessor.printInfoBike(bike2);

        vehicleProcessor.printInfoBoeing(boeing);

        vehicleProcessor.startMovable(car);
        vehicleProcessor.startMovable(car2);
        vehicleProcessor.startMovable(bike);
        vehicleProcessor.startMovable(bike2);
        vehicleProcessor.startMovable(boeing);

        vehicleProcessor.stopMovable(car);
        vehicleProcessor.stopMovable(car2);
        vehicleProcessor.stopMovable(bike);
        vehicleProcessor.stopMovable(bike2);
        vehicleProcessor.stopMovable(boeing);
    }
}
