package classwork.day4;

public class VehicleProcessor {

    public void printInfoCar(Car car) {
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
    public void printInfoBike(Vehicle vehicle) {
        System.out.println("name is: " + vehicle.getName());
        System.out.println("сolor is: " + vehicle.getColor());
        System.out.println("speed is: " + vehicle.getSpeed());
        System.out.println("model is: " + vehicle.getModel());

    }

    public void printInfoBike(Bike bike) {
        System.out.println("name is: " + bike.getName());
        System.out.println("сolor is: " + bike.getColor());
        System.out.println("speed is: " + bike.getSpeed());
        System.out.println("model is: " + bike.getModel());

        }

    public void printInfoBoeing(Boeing boeing) {
        System.out.println("name is: " + boeing.getName());

    }


    public void startMovable(Movable movable){
        movable.start();
    }
    public void stopMovable(Movable movable){
        movable.stop();
    }
}
