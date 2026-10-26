package parentclass;

class Vehicle {
    protected int speed = 0;
    protected int currentGear = 0;
    protected boolean running = false;

    void start() {
        running = true;
        System.out.println("Vehicle started");
    }
    void stop() {
        running = false;
        speed = 0;
        System.out.println("Vehicle stopped");
    }
    void brake() {
        speed = Math.max(0, speed - 20);
        System.out.println("Brake applied");
    }
    void gear(int g) {
        currentGear = g;
        System.out.println("Gear changed to " + g);
    }
    void accelerator() {
        speed += 20;
        System.out.println("Accelerating");
    }
    void rightTurn() { System.out.println("Turning right"); }
    void leftTurn() { System.out.println("Turning left"); }
    void openDoor() { System.out.println("Door opened"); }
    void closeDoor() { System.out.println("Door closed"); }
    void showSpeed() { System.out.println("Speed: " + speed + " km/h"); }
}

class Motorcycle extends Vehicle {
    void openDoor() { System.out.println("Motorcycle has no doors"); }
    void closeDoor() { System.out.println("Motorcycle has no doors"); }
    void kickStart() { System.out.println("Kick start"); }
}

class Car extends Vehicle {
    void openRoof() { System.out.println("Car roof opened"); }
}

class Truck extends Vehicle {
    void loadCargo() { System.out.println("Cargo loaded"); }
}

public class VehicleUser {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.openDoor();
        c.closeDoor();
        c.gear(1);
        c.accelerator();
        c.showSpeed();
        c.leftTurn();
        c.brake();
        c.showSpeed();
        c.stop();

        Motorcycle m = new Motorcycle();
        m.kickStart();
        m.start();
        m.accelerator();
        m.rightTurn();
        m.openDoor();
        m.showSpeed();

        Truck t = new Truck();
        t.loadCargo();
        t.start();
        t.gear(2);
        t.accelerator();
        t.showSpeed();
        t.stop();
    }
}
