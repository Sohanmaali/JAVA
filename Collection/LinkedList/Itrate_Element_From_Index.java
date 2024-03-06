//Write a Java program to iterate through all elements in a linked list starting at the specified position.

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Itrate_Element_From_Index {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Index");
    int index = sc.nextInt();

    for (int i = index; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
    sc.close();
  }
}
