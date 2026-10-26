package task1_ex2;

class Car {
    String brand;
    int year;

    void displayInfo() {
        System.out.println("Car: " + brand + " (" + year + ")");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car c1 = new Car();   // first object created
        c1.brand = "Toyota";
        c1.year = 2022;

        Car c2 = new Car();   // second object created
        c2.brand = "Honda";
        c2.year = 2020;

        c1.displayInfo();
        c2.displayInfo();
    }
}
