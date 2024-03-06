import java.util.ArrayList;
import java.util.Arrays;

public class Test {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(
      Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    );
    list.ensureCapacity(10);
  }
}
// How can we find which object is repeated & how many times?
//How can we store only unique objects in indexed order?
// How can retrieve elements from Map using Iterator?
