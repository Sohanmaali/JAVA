package array;

import java.util.Scanner;

public class SumOfArrayElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[100];
		int sum = 0;
		System.out.println("Enter Lenth of array");
		int size = sc.nextInt();
		System.out.println("Enter Element of Array");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
			sum += array[i];
		}
		System.out.println("Array Elements are");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\nSum of Array Elements = " + sum);

		sc.close();
	}
}
