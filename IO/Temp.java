import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* class DataSaver {
    private String name;
    private int hindi;
    private int english;
    private int science;
    private int math;
    private int chem;

    public DataSaver() {
    }

    public DataSaver(String name, int hindi, int english, int science, int math, int chem) {
        this.name = name;
        this.hindi = hindi;
        this.english = english;
        this.science = science;
        this.math = math;
        this.chem = chem;
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
        return name + "\t " + hindi + "\t " + english + "\t " + science + "\t " + math + "\t " + chem;
    }

}

class Main {
    public static void saveData() {
        DataSaver userdata[] = new DataSaver[100];
        for (int i = 0; i < 3; i++) {
            userdata[i] = new DataSaver("sohan", 50, 50, 50, 50, 50);
            Properties properties = new Properties();
            properties.setProperty("name", userdata[i].getName());
            properties.setProperty("Hindi", String.valueOf(userdata[i].getHindi()));
            properties.setProperty("English", String.valueOf(userdata[i].getEnglish()));
            properties.setProperty("Science", String.valueOf(userdata[i].getScience()));
            properties.setProperty("Math", String.valueOf(userdata[i].getMath()));
            properties.setProperty("Chem", String.valueOf(userdata[i].getChem()));

            try (FileOutputStream fileOut = new FileOutputStream("userdata.properties")) {
                properties.store(fileOut, "User Data");
                System.out.println("Data saved successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        saveData();
    }
}
 */

class DataSaver {
    private String name;
    private int hindi;
    private int english;
    private int science;
    private int math;
    private int chem;

    public DataSaver() {
    }

    public DataSaver(String name, int hindi, int english, int science, int math, int chem) {
        this.name = name;
        this.hindi = hindi;
        this.english = english;
        this.science = science;
        this.math = math;
        this.chem = chem;
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
        return name + "\t " + hindi + "\t " + english + "\t " + science + "\t " + math + "\t " + chem;
    }

}

class Main {

    public static void saveData() {
        DataSaver userdata[] = new DataSaver[100];
        Properties properties = new Properties();
        for (int i = 0; i < 3; i++) {
            userdata[i] = new DataSaver("sohan", 50, 50, 50, 50, 50);
            properties.setProperty("name", userdata[i].getName());
            properties.setProperty("Hindi", String.valueOf(userdata[i].getHindi()));
            properties.setProperty("English", String.valueOf(userdata[i].getEnglish()));
            properties.setProperty("Science", String.valueOf(userdata[i].getScience()));
            properties.setProperty("Math", String.valueOf(userdata[i].getMath()));
            properties.setProperty("Chem", String.valueOf(userdata[i].getChem()));

            try (FileOutputStream fileOut = new FileOutputStream("userdata.properties", true)) {
                properties.store(fileOut, "User Data");
                System.out.println("Data saved successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        saveData();

    }
}
