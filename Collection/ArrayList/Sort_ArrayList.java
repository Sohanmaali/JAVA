//Write a Java program to sort a given array list.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort_ArrayList {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>(
      Arrays.asList(9, 5, 7, 6, 2, 3, 4, 8, 1, 10)
    );
    Using Buble Sort
    for (int i = 0; i < arr.size() - 1; i++) {
      for (int j = 0; j < arr.size() - 1 - i; j++) {
        if (arr.get(j) > arr.get(j + 1)) {
          int temp = arr.get(j);
          arr.set(j, arr.get(j + 1));
          arr.set(j + 1, temp);
        }
      }
    }

    // Using Method

    Collections.sort(arr);

    System.out.println(arr);
  }
}
