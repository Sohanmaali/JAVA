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
            String sql = "insert into Student(id,name,father,mother) values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 63);
            ps.setString(2, "Pree");
            ps.setString(3, "ManjuDevi");
            ps.setString(4, "punamchand");
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
