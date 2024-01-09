import java.util.Scanner;

/* class Student {
    String name, roll_no;
    Address add;

    public Student(String name, String roll_no, int hno, String state, String city) {
        this.name = name;
        this.roll_no = roll_no;
        add = new Address(state, city, hno);
    }

    public void details() {
        System.out.println("Name    :  " + name);
        System.out.println("Roll_no :  " + roll_no);
        System.out.println("House NO:  " + add.hno);
        System.out.println("State   :  " + add.state);
        System.out.println("City    :  " + add.city);

    }

    class Address {
        String state, city;
        int hno;

        public Address(String state, String city, int hno) {
            this.state = state;
            this.city = city;
            this.hno = hno;
        }
    }
}

class TestMain {
    public static void main(String args[]) {
        Student ob = new Student("Kapil", "420", 57, "MP", "indore");
        ob.details();
    }
} */
@FunctionalInterface
interface Student {

    void display();

    // void d();

}

// class Demo implements Student {
// // @FunctionalInterface
// Student s = () -> System.out.println("hello");

// // s.display();
// }

class Test1 {
    public static void main(String args[]) {
        Student s = () -> System.out.println("hello");
        s.display();
    }
}