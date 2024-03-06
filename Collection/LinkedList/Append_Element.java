// Write a Java program to append the specified element to the end of a linked list.

import java.util.Arrays;
import java.util.LinkedList;

public class Append_Element {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)
    );
    list.addLast(10);
    System.out.println(list);
  }
}
