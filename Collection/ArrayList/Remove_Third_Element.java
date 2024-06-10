//Write a Java program to remove the third element from an array list.

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Third_Element {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>(
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    arr.remove(3);
    System.out.println(arr);
  }
}
