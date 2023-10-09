package array;

import java.util.Scanner;

//Sohan
public class CountDuplicateElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[100];
		int count = 0;
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
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] == array[j]) {
					count++;
					for (int k = 0; k < size; k++) {
						array[k] = array[k + 1];
					}
					size--;
					j--;
				}
			}
		}
		System.out.println("\nArray Elements are");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\nDuplicate Elements are = " + count);
		sc.close();
//		System.out.println("\"Java\"");
	}
}
