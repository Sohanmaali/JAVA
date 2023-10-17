package jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteRow {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        PreparedStatement st1;
        Statement st;
        Connection con;
        ResultSet rs;

        String path = "jdbc:mysql://localhost:3306/Infojava";

        String showTable = "select * from Student";
        String deleterow = "delete from Student where id = 1002";
        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager.getConnection(path, "root", "root");  //connect DataBase

        st = con.createStatement();

        int i = st.executeUpdate(deleterow);

        if (i > 0) {
            System.out.println("Succes");
        } else {
            System.out.println("Fail");
        }

        st1 = con.prepareStatement(showTable);
        rs = st1.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getString(4));
        }
        try {

        } finally {
            con.close();
        }
    }
}
