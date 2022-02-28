package main.java.tasks.classwork.day4;

public class VehicleProcessor {

    public void printInfoVehicle(Vehicle vehicle) {
        System.out.println("name is: " + vehicle.getName());
        System.out.println("сolor is: " + vehicle.getColor());
        System.out.println("speed is: " + vehicle.getSpeed());
        System.out.println("model is: " + vehicle.getModel());
        System.out.println("wheels # " + vehicle.getWheels().length);

        for (Wheel wheel : vehicle.getWheels()) {
            System.out.println("---- wheels drill down:");
            System.out.println("wheel type is: " + wheel.getType());
            System.out.println("wheel diametr: " + wheel.getDiametr());

        }
    }


    public void printMachinaryDetails(Machinary machinary) {

        System.out.println("name is: " + machinary.getName());

        if (!(machinary instanceof Plane)) {
            System.out.println("model is: " + ((Vehicle) machinary).getModel());
        }
    }

    public void printInfoBoeing(Boeing boeing) {
        System.out.println("name is: " + boeing.getName());

    }


    public void startMovable(Movable movable) {
        movable.start();
    }

    public void stopMovable(Movable movable) {
        movable.stop();
    }
}
