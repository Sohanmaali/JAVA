//Write a Java program to copy one array list into another.

import java.util.Arrays;
import java.util.LinkedList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Copy_Element {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );
    ArrayList<Integer> arr1 = new ArrayList<Integer>();
    //Without Using Method
    // for (Integer integer : arr) {
    //   arr1.add(integer);
    // }

    // Using Method
    Collections.copy(arr, arr1); //not Work
    System.out.println(arr1);
  }
}
