import java.util.Collection;
import java.util.HashMap;

public class Test_Cases {

  public static void main(String[] args) {
    HashMap map = new HashMap<>();

    map.put(1, 10);
    map.put(2, 20);
    map.put(3, 30);
    map.put(4, 40);
    // System.out.println(map);

    // System.out.println(map.containsKey(20));
    // System.out.println(map.containsValue(2));
    Collection c = map.values();
    // System.out.println(c);

    // c = map.keySet();

    c = map.entrySet();
    System.out.println(c);
  }
}
