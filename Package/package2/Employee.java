package package2;
import package1.Person;
public class Employee extends Person {
    int id;
    String posi;
	String type;
    public Employee() {
        super();
    }
    public Employee(String name, int age,int id,String posi,String type) {
        super(name,age);
        this.id = id;
        this.posi = posi;
        this.type = type;
    }
    public void show() {
        super.show();
        System.out.println("ID = "+id);
        System.out.println("Position = "+posi);
        System.out.println("Employee Type = "+type);
    }
}