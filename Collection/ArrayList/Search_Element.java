//Write a Java program to search for an element in an array list.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Search_Element {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Searching element");
    int element = sc.nextInt();

    //Searching Element without Using Method
    int c = 0;
    for (Integer integer : arr) {
      if (integer == element) {
        c++;
        break;
      }
    }
    if (c != 0) {
      System.out.println("Element Present");
    } else {
      System.out.println("Element Not Present");
    }

    // Using Method
    if (arr.contains(element)) {
      System.out.println("Element Present");
    } else {
      System.out.println("Element Not Present");
    }
    sc.close();
  }
}
