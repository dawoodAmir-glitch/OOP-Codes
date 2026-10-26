package exercise_q2;

class Temperature {
    private double celsius;              

   
    Temperature(double celsius) {
        this.celsius = celsius;
    }

    void setCelsius(double c) {
        celsius = c;
    }

    void setFahrenheit(double f) {
        celsius = (f - 32) * 5 / 9;     
    }

    double getCelsius() {
        return celsius;
    }

    double getFahrenheit() {
        return (celsius * 9 / 5) + 32;   
    }

    void display() {
        System.out.printf("%.2f C = %.2f F%n", getCelsius(), getFahrenheit());
    }
}

public class TemperatureDemo {
    public static void main(String[] args) {
        Temperature t = new Temperature(25);   
        t.display();

        t.setFahrenheit(98.6);                 
        t.display();

        t.setCelsius(100);
        t.display();
    }
}
