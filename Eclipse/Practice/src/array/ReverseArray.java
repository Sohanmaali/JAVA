package array;

import java.util.Scanner;

public class ReverseArray {
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
		for (int i = 0; i <size / 2; i++) {
			int temp =array[i];
			array[i] = array[size - i-1];
			array[size-i-1]=temp;
		}
		System.out.println("\nAfter Reverse of Array");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		sc.close();
	}

}
