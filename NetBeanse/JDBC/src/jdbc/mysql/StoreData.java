package jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StoreData {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Statement st;
        Connection con;
        String cmd = "insert into Student values(1003,'mohan','rajesh','rani',52)";
        String path = "jdbc:mysql://localhost:3306/Infojava";

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(path, "root", "root");
        st = con.createStatement();
      //   rs.absolute(i);
        int i = st.executeUpdate(cmd);
        //con.commit();
        if (i > 0) {
            System.out.println("Succes");
        } else {
            System.out.println("Fail");
        }
        try {

        } finally {
            con.close();
        }
    }
}
