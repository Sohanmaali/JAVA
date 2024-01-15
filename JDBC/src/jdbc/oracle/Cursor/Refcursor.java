package jdbc.oracle.Cursor;

/**
 *
 * @author Sohan_Maali
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import oracle.jdbc.OracleTypes;
//create or replace procedure getAllStudent(roll IN number,name OUT SYS_REFCURSOR) as
// BEGIN
// open name for
// select * from student where roll < roll;
//END;
// /

public class Refcursor {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger")) {
                CallableStatement call = con.prepareCall("{call getAllStudent(?,?)}");
                call.setInt(1, 104);
                call.registerOutParameter(2, OracleTypes.CURSOR);
                call.execute();
                ResultSet rs = (ResultSet) call.getObject(2);
                while (rs.next()) {
                    System.out.println(rs.getInt(1));
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
