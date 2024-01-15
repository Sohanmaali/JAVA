class Test {
     int i = 100;

     public static void main(String[] args) {
          int i = 10;
          System.out.println(i);
          System.out.println(new Test().i);
     }

     void m() {
          int i = 10;
     }
}