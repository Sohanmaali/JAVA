package array;

import java.util.Scanner;

public class CopyArrayElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[100];
		int array1[] = new int[100];
		System.out.println("Enter Lenth of array");
		int size = sc.nextInt();
		System.out.println("Enter Element of Array");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
			array1[i] = array[i];

		}
		System.out.println("Array Elements are");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\nAfter Copy of Array element ");
		for (int i = 0; i < size; i++) {
			System.out.print(array1[i] + " ");
		}
		sc.close();
	}
}
