
package jdbc.oracle.function;

/**
 *
 * @author Sohan_Maali
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

//CREATE OR REPLACE FUNCTION getAvg(id1 IN NUMBER, id2 IN NUMBER) RETURN NUMBER AS
//  num1 NUMBER;
//  num2 NUMBER;
//BEGIN
//  SELECT mark INTO num1 FROM student WHERE mark = id1;
//  SELECT mark INTO num2 FROM student WHERE mark = id2;
//  RETURN (num1 + num2) / 2;
//END;
///
public class Avrage {
    
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
            CallableStatement call = con.prepareCall("{? =call getAvg(?,?)}");
            call.setInt(2, 101);
            call.setInt(3, 103);
            call.registerOutParameter(1, Types.FLOAT);
            call.execute();
            System.out.println(call.getFloat(1));
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
