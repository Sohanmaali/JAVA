//Write a Java program to compare two array lists.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Compare_Two_ArrayList {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>(
      Arrays.asList(1, 2, 3, 4, 5, 55, 7, 8, 9, 10)
    );

    ArrayList<Integer> arr1 = new ArrayList<Integer>(
      Arrays.asList(1, 2, 3, 4, 5, 55, 7, 8, 9, 10)
    );

    if (arr.size() != arr1.size()) {
      System.out.println("Arrays are Not Equal");
      return;
    }

    Collections.sort(arr);
    Collections.sort(arr1);
    for (int i = 0; i < arr.size(); i++) {
      if (arr1.get(i) != arr.get(i)) {
        System.out.println("Arrays are Not Equal");
        return;
      }
    }
    System.out.println("Arrays Are Equale");
  }
}
