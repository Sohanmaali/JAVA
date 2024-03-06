//Write a Java program to join two array lists.

import java.util.ArrayList;
import java.util.Arrays;

public class Joine_Two_ArrayList {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );

    ArrayList<Integer> arr1 = new ArrayList<Integer>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );

    for (Integer i : arr1) {
      arr.add(i);
    }
    // arr.addAll(arr1)
    System.out.println(arr);
  }
}
