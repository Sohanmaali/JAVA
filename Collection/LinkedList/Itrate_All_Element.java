// Write a Java program to iterate through all elements in a linked list.

import java.util.Arrays;
import java.util.LinkedList;

public class Itrate_All_Element {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10)
    );
    for (Integer i : list) {
      System.out.print(i + " ");
    }
  }
}
