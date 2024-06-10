//Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Retrive_Element_From_Index {

  public static void main(String[] args) {
    ArrayList<Integer> element = new ArrayList<Integer>(
        Arrays.asList(1, 5, 2, 6, 3, 4, 8, 9, 6, 10));

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Staring Index");

    int index = sc.nextInt();

    for (int i = index; i < element.size(); i++) {

      System.out.print(element.get(i) + "  ");

    }
    sc.close();
  }
}
