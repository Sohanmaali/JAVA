//Write a Java program to shuffle elements in a linked list.

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Shuffle {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );
    Collections.shuffle(list);
    System.out.println(list);
  }
}
