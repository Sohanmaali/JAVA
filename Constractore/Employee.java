public class Employee implements Cloneable {
    String name;
    int salaray;

    Employee(int salaray, String name) {
        this.name = name;
        this.salaray = salaray;
    }

    Employee(Employee emp) {
        this(emp.salaray + 80, emp.name);
    }

    Employee() {

    }

    public Employee clone() throws CloneNotSupportedException {
        Employee e = (Employee) super.clone();
        Employee e1 = new Employee();
        e1.salaray = e.salaray;

        e1.name = e.name;
        return e1;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp1 = new Employee(1000, "sohan");
        // System.out.println("emp1 " + emp1);

        // Employee emp2 = emp1;
        // emp2.salaray = 5000;
        // System.out.println("emp1 " + emp1.salaray + " emp2 " + emp2.salaray);

        // Employee emp3 = new Employee(emp1);
        // System.out.println("emp1 " + emp1.salaray + " emp3 " + emp3.salaray);

        Employee e = emp1.clone();

        System.out.println("emp1 " + emp1.salaray + " e " + e.salaray);
        e.salaray = 6000;

        System.out.println("emp1 " + emp1.salaray + " e " + e.salaray);
    }
}
