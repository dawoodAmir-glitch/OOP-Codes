
interface Vehicle {
    void move(int distance);
    double getDistanceTravelled();
    void setSpeed(double speed);
    double getSpeed();
    void setTopSpeed(double tspeed);
    double getTopSpeed();
    boolean isBroken();
    int getSeats();
    void setSeats(int seats);
    void setPropulsionTechnology(String technology);
    String getPropulsionTechnology(); // fueling mechanism
    void setPick(double pick);
    double getPick();
}

class Automobile implements Vehicle {
    private double distanceTravelled = 0;
    private double speed = 0;
    private double topSpeed = 0;
    private boolean broken = false;
    private int seats = 0;
    private String propulsionTechnology = "Petrol";
    private double pick = 0;

    public void move(int distance) {
        if (broken) {
            System.out.println("Vehicle is broken, cannot move.");
            return;
        }
        distanceTravelled += distance;
    }

    public double getDistanceTravelled() { return distanceTravelled; }

    public void setSpeed(double speed) {
        if (speed > topSpeed && topSpeed > 0) {
            // exceeding top speed breaks the vehicle
            broken = true;
            this.speed = 0;
            System.out.println("Speed exceeded top speed: vehicle broke down!");
        } else {
            this.speed = speed;
        }
    }

    public double getSpeed() { return speed; }
    public void setTopSpeed(double tspeed) { topSpeed = tspeed; }
    public double getTopSpeed() { return topSpeed; }
    public boolean isBroken() { return broken; }
    public int getSeats() { return seats; }
    public void setSeats(int seats) { this.seats = seats; }
    public void setPropulsionTechnology(String technology) { propulsionTechnology = technology; }
    public String getPropulsionTechnology() { return propulsionTechnology; }
    public void setPick(double pick) { this.pick = pick; }
    public double getPick() { return pick; }
}

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle v = new Automobile();
        v.setSeats(5);
        v.setTopSpeed(180);
        v.setPropulsionTechnology("Petrol");
        v.setPick(12.5);
        v.setSpeed(80);
        v.move(120);
        v.move(30);

        System.out.println("Seats: " + v.getSeats());
        System.out.println("Fuel: " + v.getPropulsionTechnology());
        System.out.println("Speed: " + v.getSpeed() + " / top " + v.getTopSpeed());
        System.out.println("Distance travelled: " + v.getDistanceTravelled());
        System.out.println("Pick: " + v.getPick());
        System.out.println("Broken? " + v.isBroken());

        v.setSpeed(250); // exceeds top speed
        System.out.println("Broken? " + v.isBroken());
        v.move(10);
    }
}
