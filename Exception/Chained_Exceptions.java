
public class Chained_Exceptions {
     public static void main(String[] args) {
          int i = 10;
          try {
               String s = null;
               int num = Integer.parseInt(s);
          } catch (RuntimeException e) {
               // RuntimeException ex = new RuntimeException();
               e.initCause(new NullPointerException("Chale ja sale Yas se"));
               System.out.println(e.getCause());
               // throw e;
          }
     }
}
