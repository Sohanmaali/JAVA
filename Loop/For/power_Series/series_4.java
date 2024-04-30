
//WAP to x^1/1 + x^2/2 + x^3/3 + x^4/4 + x^5/5  =  36.75
//3 4
import java.util.Scanner;

public class Series_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two num ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		float sum = 0, power = 1;
		for (int i = 1; i <= y; i++) {
			power *= x;
			sum += power / i;
			if (i > 1)
				System.out.print(" + ");
			System.out.print(x + "^" + i + "/" + i);
		}
		System.out.print(" = " + sum);
	}
}