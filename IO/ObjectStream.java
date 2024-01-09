import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ObjectStream {
     public static void main(String[] args) throws IOException {
          ObjectOutputStream oos = null;
          ObjectInputStream ois = null;

          // try {
          // Create a new file with an ObjectOutputStream
          FileOutputStream fos = new FileOutputStream("ObjectStream.txt");
          oos = new ObjectOutputStream(fos);

          // Write objects to the file
          oos.writeInt(100);
          oos.writeChars("Geeks For Geeks");
          oos.flush();

          // Create an ObjectInputStream
          FileInputStream fis = new FileInputStream("ObjectStream.txt");
          ois = new ObjectInputStream(fis);

          // Use readBoolean() and readUTF() to read objects
          int booleanValue = ois.readInt();
          String stringValue = ois.readLine();

          System.out.println("Use of readBoolean(): " + booleanValue);
          System.out.println("Use of readUTF(): " + stringValue);
          // } catch (IOException e) {
          // System.out.println(e);
          // }
          oos.close();
          ois.close();
     }
}
