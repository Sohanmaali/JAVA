//Write a Java program to join two linked lists.

import java.util.Arrays;
import java.util.LinkedList;

public class Joine_Two_LinkedList {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );
    LinkedList<Integer> list1 = new LinkedList<>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );

    // for (Integer i : list1) {
    //   list.add(i);
    // }
    list.addAll(list1);
    System.out.println(list);
  }
}
