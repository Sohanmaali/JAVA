// public class Chack_Case {
//      public static void main(String[] args) {
//           int i = 1;
//           try {
//                i++;
//           } catch (Exception e) {
//                i++;
//           } finally {
//                i++;
//           }
//           // System.out.println(i);
//           // System.out.println(10.0 / 0.0);
//           String s = new String("Sohan");
//           String s1 = new String("Sohan");
//           System.out.println("s = " + s.hashCode());
//           System.out.println("s1 = " + s1.hashCode());
//      }
// }

// class Chack_Case {
//      public static void main(String[] args) {

//           if (true && Chack_Case.m1()) {
//                System.out.println("Hello");
//           }
//      }

//      public static boolean m1() {
//           System.out.println(10 / 0);
//           return true;
//      }
// }
class MyClass {
     static {
          try {
               throw new IOException("This is a checked exception");
          } catch (IOException e) {
               System.out.println(e);

          }
     }

     public static void main(String[] args) {
          // ...
     }
}
