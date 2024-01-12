package jdbc.oracle;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author Sohan_Maali
 */
public class RetriveData {
    
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
            String quary = "SELECT * FROM Student";
            PreparedStatement st = con.prepareStatement(quary);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getInt(4));
            }
        } catch (ClassNotFoundException | SQLException e) {
            
            System.out.println(e);
        }
    }
    
}
