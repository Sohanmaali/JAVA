package package2;
import package1.Person;
public class Student extends Person {
    int roll;
    int mark;
	String branch;
    public Student() {
        super();
    }
    public Student(String name,int age,int roll,int mark,String branch) {
        super(name,age);
        this.roll= roll;
        this.mark = mark;
        this.branch = branch;
    }
    public void show() {
        super.show();
        System.out.println("Roll Number = "+this.roll);
        System.out.println("Marks = "+this.mark);
        System.out.println("Student Branch = "+this.branch);
    }
}