
interface DrawableDefault {
    void draw();

    default void msg() { System.out.println("default method"); }
}

class RectangleDefault implements DrawableDefault {
    public void draw() { System.out.println("drawing rectangle"); }
}

public class TestInterfaceDefault {
    public static void main(String args[]) {
        DrawableDefault d = new RectangleDefault();
        d.draw();
        d.msg();
    }
}
