import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.Scanner;

class MarksheetData implements Serializable {
	int roll, p, c, m, h, e;
	String name;

	public MarksheetData() {
	}

	public MarksheetData(int roll, String name, int p, int c, int m, int h, int e) {
		this.roll = roll;
		this.name = name;
		this.p = p;
		this.c = c;
		this.m = m;
		this.h = h;
		this.e = e;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getRoll() {
		return roll;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getP() {
		return p;
	}

	public int getC() {
		return c;
	}

	public int getM() {
		return m;
	}

	public int getH() {
		return h;
	}

	public int getE() {
		return e;
	}

	@Override
	public String toString() {
		return roll + "\t " + name + "\t " + p + "\t " + c + "\t " + m + "\t " + h + "\t " + e;
	}

}

class Marksheet {
	static int i = 0, count = 0;

	public static void main(String args[]) throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		MarksheetData marksheet[] = new MarksheetData[100];
		Marksheet ob = new Marksheet();
		System.out.println("How many Data Yoy want To fill ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter The roll Number");
			int roll = ob.cheakRoll(marksheet, i, ob);
			sc.nextLine();
			System.out.println("Enter The name ");
			String name = sc.nextLine();

			System.out.println("Enter Physics Marks");
			int p = ob.cheakMarks(sc);

			System.out.println("Enter Chemistry Marks");
			int c = ob.cheakMarks(sc);

			System.out.println("Enter Maths Marks");
			int m = ob.cheakMarks(sc);

			System.out.println("Enter Hindi Marks");
			int h = ob.cheakMarks(sc);

			System.out.println("Enter English Marks");
			int e = ob.cheakMarks(sc);

			marksheet[i] = new MarksheetData(roll, name, p, c, m, h, e);
		}

		File f = new File("Marksheet.txt");
		FileOutputStream fos = new FileOutputStream(f, true);
		PrintStream pw = new PrintStream(fos);
		String s = "Roll\t Name \t Phys\t Chem \t Maths \t Hindi \t English";

	}

	public int cheakMarks(Scanner sc) {
		int marks = sc.nextInt();
		while (marks < 0 || marks > 100) {

			System.out.println("Invalid  Marks");
			System.out.println("Please Re-Enter The Marks:");
			marks = sc.nextInt();
		}
		return marks;
	}

	public int cheakRoll(MarksheetData marksheet[], int i, Marksheet ob) {
		Scanner sc = new Scanner(System.in);
		int roll;
		boolean flag;
		do {
			roll = sc.nextInt();
			flag = false;
			for (int j = 0; i > 0 && j < i; j++) {
				if (marksheet[j].getRoll() == roll) {
					System.out.println("roll number is alredy Exist plese Enter Other roll Number ");
					flag = true;
				}
			}
		} while (flag);
		return roll;

	}
}