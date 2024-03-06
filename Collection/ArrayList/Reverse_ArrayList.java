//Write a Java program to reverse elements in an array list.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Reverse_ArrayList {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );

    for (int i = 0; i < arr.size() / 2; i++) {
      int temp = arr.get(i);
      arr.set(i, arr.get(arr.size() - 1 - i));
      arr.set(arr.size() - 1 - i, temp);
    }

    // Using Method
    Collections.reverse(arr);
    System.out.println(arr);
  }
}
