public class Local_Inner {
     int x = 10;
     final int y = 100;

     public void m() {
          class InnerLocal_Inner {
               public void m2() {
                    System.out.println(x);
                    System.out.println(y);
               }
          }
          new InnerLocal_Inner().m2();
     }

     public static void main(String[] args) {
          new Local_Inner().m();
     }
}
