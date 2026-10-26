package task3_mini;

class Car {
    String color;                      // instance variable -> Heap (inside the object)
    static String model = "Corolla";   // static variable   -> Method Area (shared)

    Car(String color) {
        this.color = color;
    }

    void showDetails() {
        int speed = 120;               // local variable    -> Stack (temporary)
        System.out.println("Speed (local)    : " + speed + " km/h -> Stack");
        System.out.println("Color (instance) : " + color + " -> Heap, own copy per object");
        System.out.println("Model (static)   : " + model + " -> Method Area, shared");
    }
}

public class CarMemoryDemo {
    public static void main(String[] args) {
        Car c1 = new Car("Red");
        Car c2 = new Car("Blue");

        c1.showDetails();
        System.out.println();
        c2.showDetails();

        Car.model = "Civic";           // one change is seen by every Car object
        System.out.println("\nAfter Car.model = \"Civic\": " + Car.model);
    }
}
