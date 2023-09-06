package jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DataRetrive {

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

        ResultSetMetaData md = rs.getMetaData();
        System.out.println(md.getColumnName(1) + "\t    " + md.getColumnName(2) + "\t    " + md.getColumnName(3) + "\t    " + md.getColumnName(4) + "\t    " + md.getColumnName(5));
        while (rs.next()) {
            // rs.absolute(i);
            System.out.println(rs.getInt(1) + "\t    " + rs.getString(2) + "\t    " + rs.getString(3) + "\t    " + rs.getString(4) + "\t    " + rs.getInt(5));
        }
        con.close();

    }
}
