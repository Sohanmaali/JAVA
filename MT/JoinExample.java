class MyRunnable extends Thread {
     public void run() {
          for (int i = 1; i <= 15; i++) {0
               System.out.println("Sita");
               // try {
               //      // Simulate some work
               //      // Thread.sleep(1000);
               // } catch (InterruptedException e) {
               //      System.out.println(e);
               // }
          }
     }
}

public class JoinExample {
     public static void main(String[] args) {
          MyRunnable thread1 = new MyRunnable();
          // Start both threads
          thread1.start();

          // try {
          // // Wait for thread1 to finish
          // thread1.join();

          // } catch (InterruptedException e) {
          // System.out.println(e);
          // }
          for (int i = 0; i < 15; i++) {
               System.out.println("Rama");
          }
          System.out.println("Both threads have finished.");
     }
}
