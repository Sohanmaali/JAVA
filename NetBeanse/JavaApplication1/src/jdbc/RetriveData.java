package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetriveData {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        PreparedStatement st;
        Connection con;
        ResultSet rs;

        String path = "jdbc:mysql://localhost:3306/Infojava";

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(path, "root", "root");

        String sql = "select * from Student";
        st = con.prepareStatement(sql);
        rs = st.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getString(4));
        }
        try {

        } finally {
            con.close();
        }
    }
}
