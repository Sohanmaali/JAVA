package jdbc.mysql.preparedstatement;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class DeleteRow {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String path = "jdbc:mysql://localhost:3306/Infojava";
        String idpss = "root";
        String sql = "DELETE FROM Student WHERE ID = ?";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection con = DriverManager.getConnection(path, idpss, idpss)) {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 1003);

            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Data Save Succes");
            } else {
                System.out.println("fail");
            }
        }
    }
}
