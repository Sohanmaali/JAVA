package jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class First {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        PreparedStatement st;
        Connection con;
        ResultSet rs;
        //  String cmd = "insert into Student values(1002,'sohan','rajesh','rani',100)";

        final String path = "jdbc:mysql://localhost:3306/Infojava";
        final String idpass = "root";

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(path, idpass, idpass);
        //   st = con.prepareStatement();

        String sql = "select * from Student";
        st = con.prepareStatement(sql);
        rs = st.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + "  " + rs.getString(5));
        }
        try {

        } finally {
            con.close();
        }
    }
}
