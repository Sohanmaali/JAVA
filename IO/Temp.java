import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class DataSaver implements Serialization {

    private String name;
    private int hindi;
    private int english;
    private int science;
    private int math;
    private int chem;
    private int roll;

    public DataSaver() {
    }

    public DataSaver(String name, int hindi, int english, int science, int math, int chem, int roll) {
        this.name = name;
        this.hindi = hindi;
        this.english = english;
        this.science = science;
        this.math = math;
        this.chem = chem;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHindi() {
        return hindi;
    }

    public void setHindi(int hindi) {
        this.hindi = hindi;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getChem() {
        return chem;
    }

    public void setChem(int chem) {
        this.chem = chem;
    }

    @Override
    public String toString() {
        return name + "\t " + hindi + "\t " + english + "\t " + science + "\t " + math + "\t " + chem + "\t " + roll;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}

class Main {

    public static void saveData() throws Exception {
        DataSaver userdata[] = new DataSaver[10];

        Properties properties = new Properties();
        for (int i = 0; i < 3; i++) {
            userdata[i] = new DataSaver("sohan", 51, 53, 55, 58, 60, 1001);
            properties.setProperty("Hindi", String.valueOf(userdata[i].getHindi()));
            properties.setProperty("English", String.valueOf(userdata[i].getEnglish()));
            properties.setProperty("Science", String.valueOf(userdata[i].getScience()));
            properties.setProperty("Math", String.valueOf(userdata[i].getMath()));
            properties.setProperty("Chem", String.valueOf(userdata[i].getChem()));
            properties.setProperty("Roll", String.valueOf(userdata[i].getRoll()));
            properties.setProperty("name", userdata[i].getName());

            try (FileOutputStream fileOut = new FileOutputStream("userdata.properties",
                    true)) {
                properties.store(fileOut, "User Data");
                System.out.println("Data saved successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        int roll = 1001;
        FileInputStream fileinput = null;

        Properties pro = new Properties();

        try {

            fileinput = new FileInputStream("userdata.properties");

        } catch (IOException e) {

            System.out.println("Error opening file: " + e);
        }

        pro.load(fileinput);
        int i = 0;
        // DataSaver userdata[] = new DataSaver[10];
        while (i < userdata.length) {

            int x = Integer.parseInt(pro.getProperty("Roll"));
            System.out.println(i);
            if (roll == x) {
                System.out.println(pro);
            }
            i++;
        }
        fileinput.close();
    }

    public static void main(String[] args) {
        try {
            saveData();
        } catch (Exception r) {
        }
    }
}
