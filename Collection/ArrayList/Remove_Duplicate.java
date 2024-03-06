import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Remove_Duplicate {

  //Remove Duplicate frome List

  public static void main(String[] args) {
    System.out.println("Using Set");
    System.out.println(
      removeDuplicate(new ArrayList<>(Arrays.asList(1, 2, 5, 4, 7, 8, 6, 2, 4)))
    );

    // ------------------------------------------------------------

    System.out.println("\nWithout Using set");
    System.out.println(
      removeDuplicateWithOutSet(
        new ArrayList<>(Arrays.asList(1, 2, 5, 4, 1, 8, 6, 2, 4))
      )
    );
  }

  //   using set
  public static List<Integer> removeDuplicate(List<Integer> list) {
    Set<Integer> set = new HashSet<>(list);
    List<Integer> list1 = new ArrayList<>(set);
    return list1;
  }

  //   without Set
  public static List<Integer> removeDuplicateWithOutSet(List<Integer> list) {
    Set<Integer> set = new HashSet<>(list);
    List<Integer> list1 = new ArrayList<>(set);
    return list1;
  }
}
