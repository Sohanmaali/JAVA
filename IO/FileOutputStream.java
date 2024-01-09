import java.io.FileOutputStream;

class MyFileOutputStream {

     public static void main(String args[]) {
          try {
               FileOutputStream fout = new FileOutputStream("MyFileOutputStream.txt");
               byte b[] = { 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112 };
               fout.write(b, 3, 6);
               // fout.write(65);
               fout.close();
               System.out.println("success...");
          } catch (Exception e) {
               System.out.println(e);
          }
     }
}
