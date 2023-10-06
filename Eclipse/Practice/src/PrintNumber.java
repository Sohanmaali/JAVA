import java.util.Scanner;

public class PrintNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row");
		int n = sc.nextInt();
		new PrintNumber().printNumber(n);
		sc.close();
	}

	public void printNumber(int n) {
		if (n == 0) {
			return;
		}
		printNumber(n - 1);
		System.out.print(n + " ");
	}
}