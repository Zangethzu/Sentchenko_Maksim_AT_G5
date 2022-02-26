package classwork.day4;

public class VehicleProcessor {

    public void processCar(Car car) {
        System.out.println("name is: " + car.getName());
        System.out.println("сolor is: " + car.getColor());
        System.out.println("speed is: " + car.getSpeed());
        System.out.println("model is: " + car.getModel());
        System.out.println("wheels # " + car.getModel().length());

        for (Wheel wheel : car.getWheels()) {
            System.out.println("---- wheels drill down:");
            System.out.println("wheel type is: " + wheel.getType());
            System.out.println("wheel diametr: " + wheel.getDiametr());

        }

    }
    public void processBike(Bike bike) {
        System.out.println("name is: " + bike.getName());
        System.out.println("сolor is: " + bike.getColor());
        System.out.println("speed is: " + bike.getSpeed());

        }

}
