package pattern;

import java.util.Scanner;

public class Pattern_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row");
		int row = sc.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j  < (row << 1) - (row - i); j++) {
				if (j >= row - i + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}