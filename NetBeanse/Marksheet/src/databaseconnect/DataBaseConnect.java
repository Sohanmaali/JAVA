package databaseconnect;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class DataBaseConnect {

    public static void retriveAllData(DefaultTableModel model) throws ClassNotFoundException, SQLException {

        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");

            String sql = "SELECT * FROM stregistration,marks";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                model.addRow(new Object[]{rs.getInt(1), rs.getInt(2), rs.getString(3),
                    rs.getString(4), rs.getString(5)});
            }

        } catch (ClassNotFoundException | SQLException e) {

        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Exception");
            }
        }
    }

    public static void storePersnalData(String name, String lname, String father, String mother, String dob, String course, String gender, String mobile, String gmail) throws ClassNotFoundException, SQLException {
        PreparedStatement st;
        Connection con;
        gender = "male";
        String path = "jdbc:mysql://localhost:3306/marksheet";
        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager.getConnection(path, "root", "root");
        String sql = "insert into stregistration(firstame,lastname,father,mother,dob,course,gender,mobile,gmail) values('" + name + "','" + lname + "','" + father + "','" + mother + "','" + dob + "','" + course + "','" + gender + "','" + mobile + "','" + gmail + "')";

        st = con.prepareStatement(sql);

        st.executeUpdate();

        con.close();
    }

    public static void storeMarks(int roll, int regi, int physics, int chemestry, int math, int hindi, int english) throws ClassNotFoundException, SQLException {

        PreparedStatement ps;
        Class.forName("com.mysql.cj.jdbc.Driver");
        //System.out.println("2");
        try (
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root")) {

            String cmd = "insert into marks (physics,chemistry,math,english,hindi) values (?,?,?,?,?)";

            ps = con.prepareStatement(cmd);

//                ps.setInt(1, roll);
            ps.setInt(1, physics);

            ps.setInt(2, chemestry);

            ps.setInt(3, math);

            ps.setInt(4, english);

            ps.setInt(5, hindi);

            int i = ps.executeUpdate();

            if (i > 0) {
                System.out.println("Seccusss");
            } else {
                System.out.println("Fail");
            }
        }
    }

    public static void storeAddress(String address, String block, String distric, String state, String zip) throws ClassNotFoundException, SQLException {
        PreparedStatement st;
        Connection con;

        String path = "jdbc:mysql://localhost:3306/marksheet";
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(path, "root", "root");
        String sql = "insert into address values('" + address + "','" + block + "','" + distric + "','" + state + "','" + zip + "')";

        st = con.prepareStatement(sql);
        st.executeUpdate();
        con.close();
    }

    public static void storeIdPassword(String id, String password) throws ClassNotFoundException, SQLException {
        PreparedStatement st;
        Connection con;

        String path = "jdbc:mysql://localhost:3306/marksheet";
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(path, "root", "root");
        String sql = "insert into idpass values('" + id + "','" + password + "')";

        st = con.prepareStatement(sql);
        st.executeUpdate();
        con.close();
    }

    public static boolean checkUserIDPassword(String id, String password) throws ClassNotFoundException, SQLException {
        PreparedStatement st;
        Connection con;
        ResultSet rs;

        String path = "jdbc:mysql://localhost:3306/marksheet";

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(path, "root", "root");

        String sql = "select * from idpass where id = '" + id + "'";

        st = con.prepareStatement(sql);
        rs = st.executeQuery();

        rs.next();
        try {
            return id.equals(rs.getString(1)) && password.equals(rs.getString(2));
        } catch (SQLException e) {
            return false;
        }
        //  return true;
    }

    public static boolean checkUserID(String id) throws ClassNotFoundException, SQLException {
        PreparedStatement st;
        Connection con;
        ResultSet rs;

        String path = "jdbc:mysql://localhost:3306/marksheet";

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(path, "root", "root");

        String sql = "select * from idpass where id = '" + id + "'";

        st = con.prepareStatement(sql);
        rs = st.executeQuery();

        rs.next();
        try {
            return id.equals(rs.getString(1));
        } catch (SQLException e) {
            return false;
        }
        //  return true;
    }

    public static boolean checkAdminIDPassword(String id, String password) throws ClassNotFoundException, SQLException {
        PreparedStatement st;
        Connection con;
        ResultSet rs;

        String path = "jdbc:mysql://localhost:3306/marksheet";

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(path, "root", "root");

        String sql = "select * from adminidpass where id = '" + id + "'";

        st = con.prepareStatement(sql);
        rs = st.executeQuery();

        rs.next();
        try {
            return id.equals(rs.getString(1)) && password.equals(rs.getString(2));

        } catch (SQLException e) {

            return false;
        } finally {
            con.close();
        }
    }

    public static void storeStudentMarks(int physics, int chemistry, int math, int hindi, int english) throws ClassNotFoundException, SQLException {
        PreparedStatement st;
        Connection con;

        String path = "jdbc:mysql://localhost:3306/marksheet";
        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager.getConnection(path, "root", "root");
        String sql = "insert into marks values('" + physics + "','" + chemistry + "','" + math + "','" + english + "','" + hindi + "')";
        st = con.prepareStatement(sql);

        st.executeUpdate();

        con.close();

    }

    public static boolean checkRollNumber(int roll) throws ClassNotFoundException, SQLException {
        PreparedStatement st;
        Connection con;
        ResultSet rs;                           //not complide

        String path = "jdbc:mysql://localhost:3306/marksheet";

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(path, "root", "root");

        String sql = "select * from marks where id = '" + roll + "'";

        st = con.prepareStatement(sql);
        try {
            rs = st.executeQuery();
            rs.next();
            return true;
        } catch (SQLException e) {
            return false;
        } finally {
            con.close();
        }
    }

    public static boolean checkRegistrationNumber(int regi) throws ClassNotFoundException, SQLException {
        PreparedStatement st;
        Connection con;
        ResultSet rs;                           //not complide

        String path = "jdbc:mysql://localhost:3306/marksheet";

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(path, "root", "root");

        String sql = "select * from stregistration where id = '" + regi + "'";

        st = con.prepareStatement(sql);
        try {
            rs = st.executeQuery();
            rs.next();
            return true;
        } catch (SQLException e) {
            return false;
        } finally {
            con.close();
        }
    }

}
