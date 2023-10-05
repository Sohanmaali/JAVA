package pattern;

import java.util.Scanner;

/*
    *
    *
  * * *
  * * *
* * * * *
* * * * *
*/
public class Pattern_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row");
		int row = sc.nextInt();
		int x, k = 1, l = row - 1;

		for (int i = 1; i <= row; i++) {
//not complied
			for (int j = 1; j <= row; j++) {
				if (j <= row) {
					System.out.print(" ");
				} else {
					System.out.print("* ");
				}
				System.out.print("* ");
			}
			System.out.println("");
		}

		/*
		 * int k = 1, l = row - 1; for (int i = 1; i <= row; i++) { if (i > 1 && i % 2
		 * != 0) { l -= 2; } for (int j = 1; j < l; j++) { System.out.print(" "); } if
		 * (i > 1 && i % 2 != 0) { k += 2; } for (int j = 1; j <= k; j++) {
		 * System.out.print("* "); } System.out.println(""); }
		 */
	}
}
