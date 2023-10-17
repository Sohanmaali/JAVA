package jdbc.mysql.preparedstatement;

import java.sql.PreparedStatement;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Connection;

//Insert data in table
public class First {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String path = "jdbc:mysql://localhost:3306/Infojava";
        String idpss = "root";
        try (Connection con = DriverManager.getConnection(path, idpss, idpss)) {
            String sql = "insert into Student values(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 33);
            ps.setString(2, "raj");
            ps.setString(3, "mahesg");
            ps.setString(4, "devi");
            ps.setInt(5, 96);
            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Data Save Succesfully");
            } else {
                System.out.println("Data save fail");
            }
            con.close();
        }
    }
}
