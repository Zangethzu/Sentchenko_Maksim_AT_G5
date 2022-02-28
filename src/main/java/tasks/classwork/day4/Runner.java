package main.java.tasks.classwork.day4;

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


        Movable car2 = new Car("Polo","Red", 100,wheels ); //Movable применяем т.к. является интерфейсом. А интерфейс можно применять как родитель
        Movable bike2 = new Bike(300, "Grey", "Kawasaki",bikeWheels);
        Movable boeing2 = new Boeing("747");


        Car car = new Car("Polo","Red", 100,wheels );
        Bike bike = new Bike(300, "Grey", "Kawasaki",bikeWheels);
        Boeing boeing = new Boeing("747");

        VehicleProcessor vehicleProcessor = new VehicleProcessor();

        vehicleProcessor.printInfoVehicle(car);
        vehicleProcessor.printInfoVehicle(bike);


        vehicleProcessor.startMovable(car);
        vehicleProcessor.startMovable(bike);
        vehicleProcessor.startMovable(boeing);

        vehicleProcessor.stopMovable(car);
        vehicleProcessor.stopMovable(bike);
        vehicleProcessor.stopMovable(boeing);


        vehicleProcessor.printMachinaryDetails(car);
        vehicleProcessor.printMachinaryDetails(bike);
        vehicleProcessor.printMachinaryDetails(boeing);


        vehicleProcessor.startMovable(new Movable() {  //создание анонимного класса. Может быть от интерейса или бастрактоного класса + он обязан имплементить их методы
            @Override
            public void start() {
                System.out.println("Boat has started");
            }

            @Override
            public void stop() {
                System.out.println("Boat has stopped");
            }
        });
    }
}
