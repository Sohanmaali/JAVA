import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.*;

class Demo implements Serializable {

     public int a;
     public String b;

     // Default constructor
     public Demo(int a, String b) {
          this.a = a;
          this.b = b;
     }

}

public class SerializationExample {
     public static void main(String[] args) {
          Demo object = new Demo(1, "sohan");
          String filename = "file.ser";
          FileOutputStream file = null;
          ObjectOutputStream out = null;

          try {
               file = new FileOutputStream(filename);
               out = new ObjectOutputStream(file);
               out.writeObject(object);

               System.out.println("Object has been serialized");

          } catch (IOException ex) {
               System.out.println("IOException is caught");
          }
          Demo object1 = null;

          // Deserialization
          try {
               // Reading the object from a file
               FileInputStream file1 = new FileInputStream(filename);
               ObjectInputStream in = new ObjectInputStream(file1);

               // Method for deserialization of object
               object1 = (Demo) in.readObject();
               System.out.println("Object has been deserialized ");
               System.out.println("a = " + object1.a);
               System.out.println("b = " + object1.b);
          } catch (IOException | ClassNotFoundException ex) {
               System.out.println("IOException is caught");
          }

     }
}
