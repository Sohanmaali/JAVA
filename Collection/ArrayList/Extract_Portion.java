//Write a Java program to extract a portion of an array list.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Extract_Portion {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>(
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Starting Index");
    int start = sc.nextInt();

    System.out.println("Enter Ending Index");
    int end = sc.nextInt();

    for (int i = start; i < end; i++) {
      System.out.print(arr.get(i) + "  ");
    }
    // Using method
    System.out.println(arr.subList(start, end));
    sc.close();
  }
}
