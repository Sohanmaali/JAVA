package array;

import java.util.Scanner;

public class MergeTwoArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[100];
		int array1[] = new int[100];

		System.out.println("Enter Lenth of First array");
		int size = sc.nextInt();
		System.out.println("Enter First Array Element");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();

		}
		System.out.println("Enter Lenth of Second array");
		int size1 = sc.nextInt();
		System.out.println("Enter Second Array Element");
		for (int i = 0; i < size; i++) {
			array1[i] = sc.nextInt();

		}
		System.out.println("First Array Elements are");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println("\nSecond Array Elements are");
		for (int i = 0; i < size; i++) {
			System.out.print(array1[i] + " ");
			array[size + i] = array1[i];
		}
		
		size += size1;

		for (int i = 0; i < size; i++) {

			for (int j = i + 1; j < size; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println("\nMerge Array Elements are");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		sc.close();
	}
}
