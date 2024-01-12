package jdbc.oracle;

/**
 * @author Sohan_Maali
 */
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateTable {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
            String query = "CREATE TABLE Student(roll int, name varchar2(10),father varchar2(10), mark int)";
            PreparedStatement st = con.prepareStatement(query);
            if (st.executeUpdate() > 0) {
                System.out.println("Table Create Success");
            } else {
                System.out.println("Table Creation Fail");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
