package pattern;
/*
*********
****_****
***___***
**_____**
*_______*
 */
import java.util.Scanner;

public class PatternThird {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row Number");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			int x = 0;
			for (int j = 1; j <= (row << 1) - 1; j++) {
				x = (j <= row ? ++x : --x);
				if (x >= row - i + 2) {
					System.out.print("_");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		sc.close();
	}
}
