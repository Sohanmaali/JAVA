package pattern;

import java.util.Scanner;

/*
 
 *
 * * *
 * * * * *
 * * * * * * *
 * * * * *
 * * * *
 * * *
 *  
 
 */
public class Pattern_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row");
		int row = sc.nextInt();
		int a = 3;
		for (int i = 1; i < row << 1; i++) {

			int x = (i <= row ? i * 2 - 1 : (row << 1) - a);

			for (int j = 1; j <= x; j++) {
				System.out.print("* ");
			}
			if (i > row) {
				a += 2;
			}
			System.out.println("");
		}
		sc.close();
	}
}
