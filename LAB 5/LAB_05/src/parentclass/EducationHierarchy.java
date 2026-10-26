package parentclass;

class Office {
    int empno;
    String empname;
    double salary;

    void getvalue() {
        System.out.println("Emp No     : " + empno);
        System.out.println("Emp Name   : " + empname);
        System.out.println("Salary     : " + salary);
    }
}

class Teaching extends Office {
    String designation;

    void setvalue(int no, String name, double sal, String desig) {
        empno = no;
        empname = name;
        salary = sal;
        designation = desig;
    }
    void getvalue() {
        super.getvalue();
        System.out.println("Designation: " + designation);
    }
}

class NonTeaching extends Office {
    String designation;

    void setvalue(int no, String name, double sal, String desig) {
        empno = no;
        empname = name;
        salary = sal;
        designation = desig;
    }
    void getvalue() {
        super.getvalue();
        System.out.println("Designation: " + designation);
    }
}

public class EducationHierarchy {
    public static void main(String[] args) {
        Teaching t = new Teaching();
        t.setvalue(101, "Dr. Ahmed", 90000, "Professor");
        System.out.println("--- Teaching Staff ---");
        t.getvalue();

        NonTeaching n = new NonTeaching();
        n.setvalue(201, "Bilal", 45000, "Lab Technician");
        System.out.println("--- Non-Teaching Staff ---");
        n.getvalue();
    }
}
