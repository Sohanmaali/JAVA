//Write a Java program to test if a hash set is empty or not.

import java.util.HashSet;

public class IsEmpty {

  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<Integer>();
    // set.add(1);
    // set.add(2);
    // set.add(3);
    // set.add(4);
    // set.add(5);
    // set.add(6);
    // set.add(7);
    // set.add(8);
    // set.add(9);
    // set.add(10);
    int size = 0;
    for (Integer object : set) {
      size++;
    }
    if (size != 0) {
      System.out.println("Not Empty");
    } else {
      System.out.println(" Empty");
    }
  }
}
