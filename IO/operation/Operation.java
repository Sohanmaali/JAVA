package operation;

import java.io.*;
import dataclass.*;

public class Operation {
    public FileOutputStream createdFile(File f1) throws Exception {
        return new FileOutputStream(f1);
    }

    public void storeData(File f1) throws Exception {
        FileOutputStream fos;
        DataClass Marksheet = new DataClass(101, "sohan", 2500);
        fos = new FileOutputStream(f1);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(Marksheet);
        oos.close();
        fos.close();
    }

    public void readData(File f1) throws Exception {
        FileInputStream fis;
        fis = new FileInputStream(f1);

        ObjectInputStream ois = new ObjectInputStream(fis);
        DataClass dc = (DataClass) ois.readObject();
        ois.close();
        fis.close();
        System.out.println(dc.getId());
        System.out.println(dc.getName());
        System.out.println(dc.getSal());
		System.out.println(dc.toString());
		
    }
}