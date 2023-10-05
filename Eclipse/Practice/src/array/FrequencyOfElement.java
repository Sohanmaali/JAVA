package array;

import java.util.Scanner;

public class FrequencyOfElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[100];
		int frequency[] = new int[100];

		System.out.println("Enter Lenth of array");
		int size = sc.nextInt();
		System.out.println("Enter Array Element");

		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		// Not complied
		System.out.println("Array Elements are");
		for (int i = 0; i < size; i++) {

			System.out.print(array[i] + " ");
		}

		for (int i = 0; i < size;) {
			int count = 1;
			for (int j = i + 1; j < size;) {
				if (array[i] == array[j]) {
					count++;
					for (int k = j; k < size; k++) {
						array[k] = array[k + 1];
					}
					size--;
					//j--;
				} else {
					j++;
				}
			}
			i++;
			frequency[i] = count;
		}

		System.out.println("\nFrequency Of Array Element");
		for (int i = 0; i < size; i++) {
			System.out.println(array[i] + " = " + frequency[i+1]);
		}
		sc.close();
	}
}
