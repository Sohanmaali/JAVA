package array;

import java.util.Scanner;

public class UniqueElementOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[100];
		
		System.out.println("Enter Lenth of array");
		int size = sc.nextInt();
		System.out.println("Enter Element of Array");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();

		}
		System.out.println("Array Elements are");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\nunique Elements of array");
		for (int i = 0; i < size; i++) {
			int count = 0;
			for (int j = i + 1; j < size; j++) {
				if (array[i] == array[j]) {
					count++;
					array[j] = -1;
				}
			}
			if (count == 0 && array[i] > -1) {
				System.out.print(array[i] + " ");
			}
		}
		sc.close();
	}
}
