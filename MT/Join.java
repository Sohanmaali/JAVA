
class MyThread extends Thread {
     public void run() {
          for (int i = 1; i <= 5; i++) {
               System.out.println("Sita");
          }
     }
}

public class Join {
     public static void main(String[] args) {
          MyThread thread1 = new MyThread();
          thread1.setPriority(8);
          thread1.start();
          for (int i = 0; i < 5; i++) {
               System.out.println("Rama");
          }
          System.out.println("Both threads have finished.");
     }
}