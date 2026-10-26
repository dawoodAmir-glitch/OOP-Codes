package task4_ex2;

class Temperature {
    double fahrenheit;

    // constructor to set value
    Temperature(double f) {
        fahrenheit = f;
    }

    // method to show value
    void show() {
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}

public class PassObjectDemo {
    public static void main(String[] args) {
        Temperature t = new Temperature(98.6);   // create object
        printDetails(t);                         // pass object to method

        // Extra: the method changes the ORIGINAL object through its reference
        raise(t, 1.0);
        t.show();
    }

    // method that receives an object as parameter
    public static void printDetails(Temperature temp) {
        System.out.println("Object received. Value = " + temp.fahrenheit);
    }

    public static void raise(Temperature temp, double by) {
        temp.fahrenheit = temp.fahrenheit + by;
    }
}
