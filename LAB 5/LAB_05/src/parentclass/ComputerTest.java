package parentclass;

class CPU {
    private double clockSpeed;

    CPU() { clockSpeed = 0; }
    CPU(double cs) { clockSpeed = cs; }
    double getClockSpeed() { return clockSpeed; }
    void setClockSpeed(double cs) { clockSpeed = cs; }
}

class Computer {
    private CPU processor;

    Computer() { processor = new CPU(); }
    Computer(CPU cpu) { processor = cpu; }
    CPU getCPU() { return processor; }
    void setCPU(CPU c) { processor = c; }
}

class PC extends Computer {
    private String operatingSystem;

    PC() {
        super();
        operatingSystem = "Unknown";
    }
    PC(CPU cpu, String os) {
        super(cpu);
        operatingSystem = os;
    }
    void print() {
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("CPU Clock Speed : " + getCPU().getClockSpeed() + " GHz");
    }
}

public class ComputerTest {
    public static void main(String[] args) {
        CPU cpu1 = new CPU();
        CPU cpu2 = new CPU(2.5);
        System.out.println("cpu1 clock speed: " + cpu1.getClockSpeed());
        cpu1.setClockSpeed(3.2);
        System.out.println("cpu1 new clock speed: " + cpu1.getClockSpeed());

        Computer comp1 = new Computer();
        Computer comp2 = new Computer(cpu2);
        System.out.println("comp1 CPU: " + comp1.getCPU().getClockSpeed());
        comp1.setCPU(cpu1);
        System.out.println("comp1 new CPU: " + comp1.getCPU().getClockSpeed());
        System.out.println("comp2 CPU: " + comp2.getCPU().getClockSpeed());

        PC pc1 = new PC();
        PC pc2 = new PC(cpu2, "Linux");
        pc1.print();
        pc2.print();
    }
}
