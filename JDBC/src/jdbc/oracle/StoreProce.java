/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.oracle;

/**
 *
 * @author Sohan_Maali
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

//CREATE OR REPLACE PROCEDURE sum(x in number, y in number,z out number) as
//	BEGIN
//Z:=X+Y;
//END;
public class StoreProce {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger")) {
                CallableStatement call = con.prepareCall("{call sum(?,?,?)}");
                call.setInt(1, 10);
                call.setInt(2, 200);
                call.registerOutParameter(3, Types.INTEGER);
                call.execute();
                System.out.println("Result = : " + call.getInt(3));
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
//            con.close();
        }
    }
}
