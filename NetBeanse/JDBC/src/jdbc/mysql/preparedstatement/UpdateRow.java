package jdbc.mysql.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateRow {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String path = "jdbc:mysql://localhost:3306/Infojava";
        String idpss = "root";
        String sql = "update Student set name = ? where id = ?";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection con = DriverManager.getConnection(path, idpss, idpss)) {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(2, 1003);
            ps.setString(1, "rani");
            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Data Save Succes");
            } else {
                System.out.println("fail");
            }
        }
    }
}
