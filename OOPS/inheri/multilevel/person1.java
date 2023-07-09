class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this.name = "";
        this.age = 0;
    }

    public void show() {
        System.out.println("Name = " + this.name);
        System.out.println("Age = " + this.age);
    }
}

class Employee extends Person {
    int id;
    String posi;
    public Employee() {
        super();
        this.id = 0;
        this.posi = "";
    }
    public Employee(String name, int age,int id,String posi) {
        super(name,age);
        this.id = id;
        this.posi = posi;
    }
    public void show() {
        super.show();
        System.out.println("ID = "+id);
        System.out.println("Position = "+posi);
    }
}

// child class
class SoftwareEngineer extends Employee {

    String type;
    public SoftwareEngineer() {
        super();
        this.type = "";
    }
    public SoftwareEngineer(String name, int age,int id,String posi,String type) {
        super(name,age,id,posi);
        this.type = type;
    }
    public void show() {
        super.show();
        System.out.println("Type = "+this.type);
    }
}

class Compny {
    public static void main(String args[]) {
        SoftwareEngineer obj = new SoftwareEngineer("sohan",21,1245,"HR","Front");
        obj.show();
    }
}