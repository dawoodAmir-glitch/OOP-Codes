package exercise_q4;

class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(7.5, 3);

        System.out.println("Rectangle 1 -> Area: " + r1.calculateArea()
                + ", Perimeter: " + r1.calculatePerimeter());
        System.out.println("Rectangle 2 -> Area: " + r2.calculateArea()
                + ", Perimeter: " + r2.calculatePerimeter());
    }
}
