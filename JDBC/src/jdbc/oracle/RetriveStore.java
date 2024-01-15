/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.oracle;

/**
 *
 * @author Sohan_Maali
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

//CREATE OR REPLACE PROCEDURE getStudent (roll IN NUMBER, name OUT VARCHAR2, mark OUT NUMBER)AS
//BEGIN
//    SELECT name, mark
//    INTO name, mark
//    FROM student
//    WHERE roll =roll;
//END;
///
public class RetriveStore {
//not work

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger")) {

                CallableStatement call = con.prepareCall("{ call getStudent(?, ?, ?) }");

                call.setInt(1, 104);

                call.registerOutParameter(2, Types.VARCHAR);

                call.registerOutParameter(3, Types.NUMERIC);
                call.execute();
                System.out.println("6");
                System.out.println(call.getString(2) + "\t" + call.getInt(3));
                System.out.println("7");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
