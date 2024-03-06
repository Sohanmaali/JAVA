import java.util.SortedSet;
import java.util.TreeSet;

public class Test {

  public static void main(String[] args) {
    SortedSet st = new TreeSet();

    // st.add("a");
    st.add(1);
    st.add(10);
    st.add(100);
    System.out.println(st);
  }
}
