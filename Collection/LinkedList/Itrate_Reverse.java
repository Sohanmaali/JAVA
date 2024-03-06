//Write a Java program to iterate a linked list in reverse order.

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Itrate_Reverse {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );

    for (int i = list.size() - 1; i >= 0; i--) {
      System.out.print(list.get(i) + " ");
    }
  }
}
