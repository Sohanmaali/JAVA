package jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class StoreData {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        PreparedStatement st;
        Connection con;
        String cmd = "insert into Student values(1002,'sohan','rajesh','rani',100)";
        String path = "jdbc:mysql://localhost:3306/Infojava";

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(path, "root", "root");
        st = con.prepareStatement(cmd);

        int i = st.executeUpdate();
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
