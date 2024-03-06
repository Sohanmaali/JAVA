//Write a Java program to get the number of elements in a hash set.

import java.util.HashSet;

public class Get_Element_Num {

  public static void main(String[] args) {
    HashSet set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(4);
    set.add(5);
    set.add(6);
    set.add(7);
    set.add(8);
    set.add(9);
    set.add(10);
    int size = 0;
    for (Object object : set) {
      size++;
    }
    System.out.println("Size = " + size);
  }
}
