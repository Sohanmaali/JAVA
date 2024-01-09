//         A
//       A B A
//     A B C B A
//   A B C D C B A
// A B C D E D C B A

import java.util.Scanner;

public class Pattern {
	public static void main(String arg[]) {
		int row = 5;
		for (int i = 1; i <= row; i++) {
			char x = 'A';
			for (int j = 1; j < row * 2; j++) {
				if (j > row - i && j <= row - 1 + i) {
					System.out.print(x + " ");
					x = (j < row ? ++x : --x);
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}