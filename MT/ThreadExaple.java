
class MyRunnable extends Thread {
     public void run() {
          System.out.println(Thread.currentThread().getName());
          for (int i = 1; i <= 15; i++) {
               System.out.println("Sita");

          }
     }
}

public class ThreadExaple {

     public static void main(String[] args) {
          MyRunnable thread1 = new MyRunnable();
          // System.out.println(thread1.getName());
          // System.out.println(Thread.currentThread().getName());
          thread1.start();
          thread1.setName("Moy moy");
          // thread1.setPriority(8);
          // System.out.println(thread1.getName());
          for (int i = 0; i < 15; i++) {
               System.out.println("Rama");
          }
          System.out.println(Thread.currentThread().getName());
          // thread1.start();
          System.out.println("Both threads have finished.");
     }

}