import java.io.*;

class Employee implements Serializable {
	
	private int id;
	private String name;
	private double sal;

	public Employee(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public Employee() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

}

class Main {
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		Employee emp = new Employee(101, "Sohan", 25000);
		File f1 = new File("D:/JAVA/IO/File/emp.txt");
		FileOutputStream fout = new FileOutputStream(f1);
		ObjectOutputStream oop = new ObjectOutputStream(fout);
		oop.writeObject(emp);

		oop.close();
		fout.close();

		FileInputStream fin = new FileInputStream(f1);
		ObjectInputStream oip = new ObjectInputStream(fin);

		Employee emp1 = (Employee) oip.readObject();

		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getSal());

		oip.close();
		fin.close();
	}
}