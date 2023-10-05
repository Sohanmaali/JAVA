package string;

import java.util.Scanner;

public class FindLenthOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String s = sc.nextLine();
		int lenth = 0;
		char arr[] = s.toCharArray();
		for (char x : arr) {
			lenth++;
		}
		System.out.println(lenth);
		sc.close();
	}
}
