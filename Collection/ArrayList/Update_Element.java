//Write a Java program to update an array element by the given element.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Update_Element {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Replace element");
    int element = sc.nextInt();

    System.out.println("Enter Replace Index");
    int index = sc.nextInt();

    arr.set(index, element);

    System.out.println(arr);
    sc.close();
  }
}
