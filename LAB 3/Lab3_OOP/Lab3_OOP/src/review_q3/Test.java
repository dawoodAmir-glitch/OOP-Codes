package review_q3;

class TestOriginal {
    int x;

    TestOriginal(int x) {
        x = x;          // BUG: parameter assigned to itself, field x stays 0
    }
}

public class Test {
    int x;

    Test(int x) {
        this.x = x;     // FIX: 'this.x' is the field, 'x' is the parameter
    }

    void display() {
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {
        Test obj = new Test(10);
        obj.display();

        TestOriginal bad = new TestOriginal(10);
        System.out.println("Buggy version leaves x = " + bad.x);
    }
}
