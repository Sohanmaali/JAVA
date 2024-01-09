import java.lang.reflect.*;

public class Get_All_Method {
     public static void main(String[] args) {
          int ccount = 0;
          Object s = new StringBuffer("sohan");
          Class c = s.getClass();
          System.out.println(c.getName());
          Method[] m = c.getDeclaredMethods();
          for (Method m1 : m) {
               System.out.println(m1.getName());
               ccount++;
          }
          System.out.println("total methos = " + ccount);
     }
}
