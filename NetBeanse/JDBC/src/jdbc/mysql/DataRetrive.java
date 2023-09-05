package jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataRetrive {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String path = "jdbc:mysql://localhost:3306/Infojava";
        String username = "root";
        String password = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");

        String sql = "SELECT * from Student";
        try (Connection connection = DriverManager.getConnection(path, username, password)) {

            Statement statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = statement.executeQuery(sql);

            System.out.println("1");

            Statement st = connection.createStatement();
            System.out.println("3");
            String sql1 = "SELECT COUNT(*) FROM Student";

            // ResultSet countResultSet = statement.executeQuery(countSql);
            // int x;
            boolean t = st.execute(sql1);
            int i = 1;
            while (rs.last()) {
                int x = rs.getRow();
            System.out.println(x);
                rs.absolute(i);
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String age = rs.getString(3);
                System.out.println(id + " " + name + " " + age);
                i++;
            }
        }
    }
}
