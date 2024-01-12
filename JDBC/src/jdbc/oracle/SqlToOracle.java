package jdbc.oracle;

/**
 *
 * @author Sohan_Maali
 */
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SqlToOracle {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
            Connection con2 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
            String query1 = "SELECT * FROM student";
            String query2 = "INSERT INTO student VALUES (?,?,?,?)";
            PreparedStatement st1 = con1.prepareStatement(query1);
            PreparedStatement st2 = con2.prepareStatement(query2);
            ResultSet rs = st1.executeQuery();
            while (rs.next()) {
                st2.setInt(1, rs.getInt(1));
                st2.setString(2, rs.getString(2));
                st2.setString(3, rs.getString(3));
                st2.setInt(4, rs.getInt(4));
                if (st2.executeUpdate() > 0) {
                    System.out.println("DATA INSERT Success");
                } else {
                    System.out.println("DATA INSERT Fail");
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
    }
}
