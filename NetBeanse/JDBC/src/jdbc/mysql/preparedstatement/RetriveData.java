
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

class RetriveData {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String path = "jdbc:mysql://localhost:3306/Infojava";
        String idpass = "root";
        String sql = "select * from Student";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection con = DriverManager.getConnection(path, idpass, idpass)) {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData md = rs.getMetaData();
            System.out.println(md.getColumnName(1) + "\t    " + md.getColumnName(2) + "\t    " + md.getColumnName(3) + "\t    " + md.getColumnName(4) + "\t    " + md.getColumnName(5));
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t    " + rs.getString(2) + "\t    " + rs.getString(3) + "\t    " + rs.getString(4) + "\t    " + rs.getInt(5));
            }
            con.close();
        }
    }
}
