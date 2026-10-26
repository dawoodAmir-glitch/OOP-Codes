
import java.awt.Color;

interface Colorable {
    // sets the color of the implementing object
    public void setColor(java.awt.Color c);

    // gets the color of the implementing object
    public java.awt.Color getColor();
}

interface Rotatable {
    // rotate the implementing object by angle degrees
    void rotate(double angle);
}

interface Translateable {
    // translate the object according to tx and ty
    void translate(int tx, int ty);
}

interface Scaleable {
    // scale the object according to sx and sy
    void scale(int sx, int sy);
}

/**
 * A shape described by its corner points. Implements all four interfaces.
 * (The manual's hint mentions the Turtle class from the last lab; this version is
 * self-contained, so it does not need it. Replace the color methods with the
 * Turtle's setColor/getColor if your last-lab Shape extends Turtle.)
 */
class Shape implements Colorable, Rotatable, Translateable, Scaleable {
    private double[] x;
    private double[] y;
    private Color color = Color.BLACK;

    Shape(double[] x, double[] y) {
        this.x = x.clone();
        this.y = y.clone();
    }

    public void setColor(Color c) { color = c; }
    public Color getColor() { return color; }

    // rotation about the origin: x' = x cos(a) - y sin(a), y' = x sin(a) + y cos(a)
    public void rotate(double angle) {
        double r = Math.toRadians(angle);
        double cos = Math.cos(r), sin = Math.sin(r);
        for (int i = 0; i < x.length; i++) {
            double nx = x[i] * cos - y[i] * sin;
            double ny = x[i] * sin + y[i] * cos;
            x[i] = nx;
            y[i] = ny;
        }
    }

    // X' = X + tx, Y' = Y + ty
    public void translate(int tx, int ty) {
        for (int i = 0; i < x.length; i++) {
            x[i] += tx;
            y[i] += ty;
        }
    }

    // X' = X * sx, Y' = Y * sy
    public void scale(int sx, int sy) {
        for (int i = 0; i < x.length; i++) {
            x[i] *= sx;
            y[i] *= sy;
        }
    }

    public void draw() {
        System.out.println("Drawing shape with color " + describe(color));
        for (int i = 0; i < x.length; i++) {
            System.out.printf("  point %d: (%.2f, %.2f)%n", i + 1, x[i], y[i]);
        }
    }

    private static String describe(Color c) {
        if (c.equals(Color.PINK)) return "PINK";
        if (c.equals(Color.RED)) return "RED";
        return c.toString();
    }
}

public class ShapeRunner {
    public static void main(String[] args) {
        // any shape, any coordinates: here a rectangle
        Shape s = new Shape(new double[] { 10, 30, 30, 10 }, new double[] { 10, 10, 20, 20 });

        s.setColor(Color.PINK);
        s.draw();

        s.rotate(45);       // rotate about some angle
        s.draw();           // redraw

        s.setColor(Color.RED);
        s.scale(2, 1);      // scale by (2,1)
        s.draw();           // redraw again

        s.translate(5, -5); // translate demo (bonus)
        s.draw();
    }
}
