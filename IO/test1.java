/* import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

class CreatingPropertiesFile {
public static void main(String args[]) throws IOException {
//Instantiating the properties file
Properties props = new Properties();
//Populating the properties file
props.put("Device_name", "OnePlus7");
props.put("Android_version", "9");
props.put("Model", "GM1901");
props.put("CPU", "Snapdragon855");
//Instantiating the FileInputStream for output file
String path = "myFile.properties";
FileOutputStream outputStrem = new FileOutputStream(path);
//Storing the properties file
props.store(outputStrem, "This is a sample properties file");
System.out.println("Properties file created......");
}
} */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* class Main {

    public static void main(String[] args) {
        try {
            readAndDisplayData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readAndDisplayData() throws IOException {
        FileInputStream fileInput = null;

        try {
            fileInput = new FileInputStream("userdata.properties");
        } catch (IOException e) {
            System.out.println(e);
        }

        Properties pro = new Properties();
        pro.load(fileInput);

        for (int i = 0; i < 3; i++) {
            String name = pro.getProperty("name" + i);
            int hindi = Integer.parseInt(pro.getProperty("Hindi" + i));
            int english = Integer.parseInt(pro.getProperty("English" + i));
            int science = Integer.parseInt(pro.getProperty("Science" + i));
            int math = Integer.parseInt(pro.getProperty("Math" + i));
            int chem = Integer.parseInt(pro.getProperty("Chem" + i));

            DataSaver user = new DataSaver(name, hindi, english, science, math, chem);
            System.out.println(user);
        }

        fileInput.close();
    }
} */







class Main {
    public static void main(String[] args) {
        FileInputStream fileInput = null;
        Properties properties = new Properties();

        try {
            fileInput = new FileInputStream("userdata.properties");
        } catch (IOException e) {
            System.out.println("Error opening file: " + e);
        }

        if (fileInput != null) {
            int i = 0;
            while (i < 3) {
                try {
                    properties.load(fileInput);
                    System.out.println(properties);
                    i++;
                } catch (IOException e) {
                    System.out.println("Error loading properties: " + e);
                }
            }

            try {
                fileInput.close();
            } catch (IOException e) {
                System.out.println("Error closing file: " + e);
            }
        }
    }
}
