
interface IWindow {
    void title(String wTitle);
    void draw();
    void minimize();
}

interface IPosition {
    void setXPos(int x);
    int getXPos();
    void setYPos(int y);
    int getYPos();
}

class RectWindow implements IWindow, IPosition {
    int xPos = 0, yPos = 0;

    public void title(String wwTitle) { System.out.println("Window's title is: " + wwTitle); }
    public void draw() { System.out.println("Drawing rectangular window"); }
    public void minimize() { System.out.println("minimizing window"); }
    public void setXPos(int x) { xPos = x; }
    public int getXPos() { return xPos; }
    public void setYPos(int y) { yPos = y; }
    public int getYPos() { return yPos; }
}

public class InterfaceTest {
    public static void main(String args[]) {
        RectWindow r = new RectWindow();
        r.title("Interfaces");
        r.draw();
        r.minimize();
        r.setXPos(50);
        System.out.println("x position is: " + r.getXPos());
        r.setYPos(100);
        System.out.println("y position is: " + r.getYPos());
    }
}
