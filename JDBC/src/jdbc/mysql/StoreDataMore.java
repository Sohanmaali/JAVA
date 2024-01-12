package jdbc.mysql;

/**
 *
 * @author Sohan_Maali
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StoreDataMore {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
            String query = "INSERT INTO student VALUES(?,?,?,?)";//INSERT INTO student VALUES(?,?,?,?
            PreparedStatement st = con.prepareStatement(query);
            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Roll Number");
                int roll = sc.nextInt();
                System.out.println("Enter Student Name");
                String sName = sc.next();
                System.out.println("Enter Father Name");
                String fName = sc.next();
                System.out.println("Enter Mark");
                int mark = sc.nextInt();
                st.setInt(1, roll);
                st.setString(2, sName);
                st.setString(3, fName);
                st.setInt(4, mark);
                if (st.executeUpdate() > 0) {
                    System.out.println("Data INsert");
                } else {
                    System.out.println("Data insert Fail");
                }
                System.out.println("Do you want to Store more Data");
                String op = sc.next();
                if (op.equalsIgnoreCase("No")) {
                    break;
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
