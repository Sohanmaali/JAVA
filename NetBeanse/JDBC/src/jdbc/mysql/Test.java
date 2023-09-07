
import java.sql.*;

class InsertPrepared {

    public static void main(String args[]) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger")) {
                PreparedStatement stmt = con.prepareStatement("insert into Emp values(?,?)");
                stmt.setInt(1, 101);
                stmt.setString(2, "Ratan");

                int i = stmt.executeUpdate();
                System.out.println(i + " records inserted");
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

    }
}
