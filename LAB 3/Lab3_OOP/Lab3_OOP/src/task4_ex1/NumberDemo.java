package task4_ex1;

public class NumberDemo {
    public static void main(String[] args) {
        int num = 10;   // original value
        changeValue(num);   // passing value to method
        System.out.println("After method call, num = " + num);   // original remains same
    }

    // method receives a copy of num
    public static void changeValue(int x) {
        x = x + 5;   // only local copy is changed
        System.out.println("Inside method, x = " + x);
    }
}
