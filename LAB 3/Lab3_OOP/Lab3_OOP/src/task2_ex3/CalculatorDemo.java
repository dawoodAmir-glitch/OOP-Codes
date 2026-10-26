package task2_ex3;

class Calculator {
    // Method 1 with 2 parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method 2 with same name as method 1 but with 3 parameters (Method Overloading)
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 numbers: " + calc.add(5, 10));
        System.out.println("Sum of 3 numbers: " + calc.add(5, 10, 15));
    }
}
