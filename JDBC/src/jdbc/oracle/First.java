package jdbc.oracle;

import java.sql.*;

public class First {

    public static void main(String args[]) throws Exception {

//step1 load the driver class  
        System.out.println("1");
        Class.forName("oracle.jdbc.driver.OracleDriver");

        try (
                //step2 create  the connection object
                Connection con = DriverManager.getConnection(
                        "jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger")) {
            System.out.println("2");
            //step3 create the statement object
            Statement stmt = con.createStatement();
            //step4 execute query
            ResultSet rs = stmt.executeQuery("select * from student");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
            }
            System.out.println(rs.next());
            //step5 close the connection object
            con.close();
        }
    }
}
