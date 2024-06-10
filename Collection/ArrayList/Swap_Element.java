//Write a Java program that swaps two elements in an array list.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Swap_Element {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>(
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter First Index");
    // int start = sc.nextInt();

    // System.out.println("Enter Last Index");
    // int end = sc.nextInt();

    // int temp = arr.get(start);
    // arr.set(start, arr.get(end));
    // arr.set(end, temp);
    // System.out.println(arr);

    // using Method

    Collections.swap(arr, 2, 4);
    System.out.println(arr);
  }
}
