
class MyRunnabl implements Runnable {
     public void run() {
          for (int i = 1; i <= 15; i++) {
               System.out.println("Sita");

          }
     }
}

public class MyRunnable {

     public static void main(String[] args) {
          MyRunnabl thread1 = new MyRunnabl();
          Thread t = new Thread(thread1);
          t.start();
          // thread1.run();

          for (int i = 0; i < 15; i++) {
               System.out.println("Rama");
          }
          // thread1.start();
          System.out.println("Both threads have finished.");
     }

}