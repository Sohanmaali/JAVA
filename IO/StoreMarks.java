
import java.io.*;
import dataclass.*;
import operation.*;

public class StoreMarks {
    public static void main(String[] args) throws Exception {
        Operation op = new Operation();

        File f1 = new File("D:/JAVA/IO/File/Marksheet.txt");

        if (f1.exists()) {
            System.out.println("File allready created");
            op.storeData(f1);
            op.readData(f1);
        } else {
            FileOutputStream fos = op.createdFile(f1);
        }
        
    }
// }