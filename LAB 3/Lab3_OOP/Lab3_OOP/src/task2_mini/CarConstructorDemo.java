package task2_mini;

class Car {
    String brand;
    int year;

    // Constructor initializes brand and year
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void showCar() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class CarConstructorDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2022);
        Car car2 = new Car("Honda", 2020);

        car1.showCar();
        car2.showCar();
    }
}
