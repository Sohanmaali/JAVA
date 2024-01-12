package jdbc.mysql;

/**
 *
 * @author Sohan_Maali
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CountRow {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
            String quary = "SELECT COUNT(*) FROM student";
            PreparedStatement st = con.prepareStatement(quary);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                System.out.println("Numer of Student in database = "+rs.getInt(1));
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
