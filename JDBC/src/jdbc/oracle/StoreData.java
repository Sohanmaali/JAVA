package jdbc.oracle;

/**
 *
 * @author Sohan_Maali
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class StoreData {

    public static void main(String[] args) {
        try {
            //oracle.jdbc.driver.OracleDriver
            Class.forName("oracle.jdbc.driver.OracleDriver");
                                                            //    //jdbc:oracle:thin:@localhost:1521:xe
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
            String quary = "INSERT INTO Student VALUES(?,?,?,?)";
            PreparedStatement st = con.prepareStatement(quary);
            st.setInt(1, 10);
            st.setString(2, "Ashu");
            st.setString(3, "Rampal");
            st.setInt(4, 80);
            if (st.executeUpdate() > 0) {
                System.out.println("Data store");
            } else {
                System.out.println("Data store");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
