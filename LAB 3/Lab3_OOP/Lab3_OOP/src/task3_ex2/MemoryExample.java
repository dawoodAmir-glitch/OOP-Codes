package task3_ex2;

class Car {
    String brand;
    int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class MemoryExample {
    public static void main(String[] args) {
        // Object creation: memory for the object is allocated in the Heap.
        // 'myCar' (a reference variable) is allocated on the Stack.
        Car myCar = new Car("Toyota", 2020);

        // Object in use: methods are invoked on 'myCar'.
        myCar.displayInfo();

        // Object becomes unreachable: the reference 'myCar' is set to null.
        // The Car object is now eligible for garbage collection.
        myCar = null;
    }
}
