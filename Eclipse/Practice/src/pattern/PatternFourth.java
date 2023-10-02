package pattern;

/*
ABCDEDCBA
ABCD_DCBA
ABC___CBA
AB_____BA
A_______A
*/

import java.util.Scanner;

public class PatternFourth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row Number");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			char ch = 'A' - 1;
			int x = 0;
			for (int j = 1; j <= (row << 1) - 1; j++) {
				x = (j <= row ? ++x : --x);
				ch = (j <= row ? ++ch : --ch);
				if (x >= row - i + 2) {
					System.out.print("_");
				} else {
					System.out.print(ch);
				}
			}
			System.out.println("");
		}
		sc.close();
	}
}
