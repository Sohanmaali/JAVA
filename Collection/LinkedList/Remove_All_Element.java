//Write a Java program to remove all elements from a linked list.

import java.util.Arrays;
import java.util.LinkedList;

public class Remove_All_Element {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );

    list.removeAll(list);
    System.out.println(list);
  }
}
