public class Demo {
     int x = 10;

     public class InnerDemo {
          int x = 100;

          public void m() {
               int x = 1000;
               System.out.println(x);
               System.out.println(this.x);
               System.out.println(Demo.this.x);
          }

     }

     public static void main(String[] args) {
          new Demo().new InnerDemo().m();
     }
}
