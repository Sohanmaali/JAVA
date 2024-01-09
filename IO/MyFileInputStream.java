import java.io.FileInputStream;
import java.io.IOException;

class MyFileInputStream {

     // public static void main(String args[]) {
     // try {
     // FileInputStream fout = new FileInputStream("MyFileOutputStream.txt");
     // int i = fout.read();
     // while (i != -1) {
     // System.out.println((char) i);
     // i = fout.read();
     // }
     // fout.close();
     // System.out.println("success...");
     // } catch (Exception e) {
     // System.out.println(e);
     // }
     // }
     public static void main(String[] args) throws IOException {
          FileInputStream fis = new FileInputStream("MyFileOutputStream.txt");
          byte[] buffer = new byte[fis.available()]; // Choose an appropriate buffer size
          fis.skip(3);
          fis.read(buffer);
          for (int i : buffer) {
               System.out.print((char) i);
          }

          fis.close();
     }
}
