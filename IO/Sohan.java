
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

class DataSaver {
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

    public static void main(String[] args) {
        try {
            // Read the roll number from the user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the roll number: ");
            int rollNumber = scanner.nextInt();
            scanner.close();

            // Call the method to retrieve and print data
            printUserData(rollNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printUserData(int rollNumber) throws IOException {
        Properties properties = new Properties();

    try (FileInputStream fileInput = new FileInputStream("userdata1.properties")) {
        properties.load(fileInput);
    } catch (IOException e) {
        System.out.println("Error opening file: " + e);
        return;
    }

    String rollKey = "Roll_" + rollNumber; // Construct the correct roll key
    System.out.println("Looking for roll key: " + rollKey); // Debug statement

    String name = properties.getProperty(rollKey + "_name");
    if (name == null) {
        System.out.println("No user data found for the provided roll number.");
        return;
    }

    System.out.println("Name found: " + name); // Debug statement

    int hindi = Integer.parseInt(properties.getProperty(rollKey + "_Hindi"));
    int english = Integer.parseInt(properties.getProperty(rollKey + "_English"));
    int science = Integer.parseInt(properties.getProperty(rollKey + "_Science"));
    int math = Integer.parseInt(properties.getProperty(rollKey + "_Math"));
    int chem = Integer.parseInt(properties.getProperty(rollKey + "_Chem"));
    int roll = Integer.parseInt(properties.getProperty(rollKey + "_Roll"));

    DataSaver userData = new DataSaver(name, hindi, english, science, math, chem, roll);
    System.out.println(userData);
	}
}