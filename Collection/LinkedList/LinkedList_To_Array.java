//Write a Java program to convert a linked list to an array list.

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_To_Array {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );

    int arr[] = new int[list.size()];

    // for (int i = 0; i < arr.length; i++) {
    //   arr[i] = list.get(i);
    // }
    arr = (Integer) list.toArray();

    for (int i : arr) {
      System.out.print(i + "  ");
    }
  }
}
