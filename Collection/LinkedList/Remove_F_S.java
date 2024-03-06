//Write a Java program to remove the first and last elements from a linked list.

import java.util.Arrays;
import java.util.LinkedList;

public class Remove_F_S {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );
    list.removeFirst();
    list.removeLast();
    System.out.println(list);
  }
}
