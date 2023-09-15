import java.io.*;
// import java.util.Scanner;

public class ChangeFileName {

    /*
     * public static void main(String[] args) throws Exception {
     * Scanner sc = new Scanner(System.in);
     * 
     * File f = new File("D:\\JAVA\\Ashish\\normal.txt");
     * 
     * File n = new File("D:\\JAVA\\Ashish\\update.txt");
     * 
     * f.createNewFile();
     * n.createNewFile();
     * 
     * System.out.println(f.renameTo(n));
     * // f.delete();
     * }
     */

    /*
     * public static void main(String args[]) throws IOException {
     * 
     * File f = new File("D:\\JAVA\\Ashish\\normal.txt");
     * 
     * File dest = new File("D:\\JAVA\\Ashish\\update.txt");
     * f.createNewFile();
     * f.delete();
     * dest.createNewFile();
     * if (f.renameTo(dest)) {
     * 
     * System.out.println("File is renamed");
     * } else {
     * 
     * System.out.println("File cannot be renamed");
     * }
     * }
     */

    public static void main(String args[]) {
        File f = new File("D:\\JAVA\\Ashish\\normal.txt");
        File dest = new File("D:\\JAVA\\Ashish\\update.txt");

        try {
            // Create a new file if it doesn't exist
            if (!f.exists()) {
                if (f.createNewFile() || dest.createNewFile()) {
                    System.out.println("File created: " + f.getName() + "  " + dest.getName());
                } else {
                    System.out.println("File creation failed.");
                }
            }

            // Delete the file represented by 'f'
            if (f.delete()) {
                System.out.println("File deleted: " + f.getName());

                // Attempt to rename 'f' to 'dest'
                if (f.renameTo(dest)) {
                    System.out.println("File is renamed");
                } else {
                    System.out.println("File cannot be renamed");
                }
            }
            // else
            {
                // System.out.println("File deletion failed.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}