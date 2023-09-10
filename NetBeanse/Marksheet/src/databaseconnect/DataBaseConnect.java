package databaseconnect;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class DataBaseConnect {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //System.out.println(checkRegistrationNumber(7));
    }

    public static void showAllStudent(DefaultTableModel model) throws ClassNotFoundException, SQLException {

        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");

            String sql = "SELECT * FROM marks";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            String sql1 = "SELECT * FROM stregistration";

            PreparedStatement ps1 = con.prepareStatement(sql1);
            ResultSet rs1 = ps1.executeQuery();
            // int roll = 0;

            while (rs.next() && rs1.next()) {
                // roll = rs.getInt(1);
                model.addRow(new Object[]{rs.getInt(1), rs1.getInt(1), rs1.getString(2),
                    rs1.getString(3), rs1.getString(4)});
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

    public static void ShowAllRegistration(DefaultTableModel model) throws ClassNotFoundException, SQLException {

        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");

            String sql = "SELECT * FROM stregistration";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                model.addRow(new Object[]{rs.getInt(1), rs.getString(2) + " " + rs.getString(3), rs.getString(4),
                    rs.getString(5)});
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

    public static void storeAddress(String address, String block, String distric, String state, String zip) throws ClassNotFoundException, SQLException {
        PreparedStatement st;
        Connection con;

        String path = "jdbc:mysql://localhost:3306/marksheet";
        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager.getConnection(path, "root", "root");

        String sql1 = "SELECT registration_num FROM stregistration";

        PreparedStatement ps = con.prepareStatement(sql1);

        ResultSet rs = ps.executeQuery();

        rs.next();

        String sql = "insert into address values(" + rs.getInt(1) + ",'" + address + "','" + block + "','" + distric + "','" + state + "','" + zip + "')";

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

        String sql1 = "SELECT registration_num FROM stregistration";

        PreparedStatement ps = con.prepareStatement(sql1);

        ResultSet rs = ps.executeQuery();

        rs.next();

        String sql = "insert into idpass values(" + rs.getInt(1) + ",'" + id + "','" + password + "')";
        System.out.println(sql);
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
            return id.equals(rs.getString(2)) && password.equals(rs.getString(3));
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

        String sql = "select * from marks where rollnumber = '" + roll + "'";

        st = con.prepareStatement(sql);
        try {
            rs = st.executeQuery();
            rs.next();
            System.out.println(rs.getInt(1));
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
        ResultSet rs = null;

        String path = "jdbc:mysql://localhost:3306/marksheet";

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(path, "root", "root");

        String sql = "select * from stregistration where registration_num = '" + regi + "'";

        st = con.prepareStatement(sql);
        try {
            rs = st.executeQuery();
            rs.next();
            System.out.println(rs.getString(1));
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            con.close();
        }
        return true;
    }

    public static int storeMarks(int roll, int regi, int physics, int chemestry, int math, int hindi, int english) {

        PreparedStatement ps = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }
        //System.out.println("2");\
        Connection con = null;
        String cmd = null;
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");

//            UPDATE table_name
//            SET column1 = value1, column2 = value2, ...
//WHERE condition;
            cmd = "UPDATE marks SET physics = ?,chemistry = ?, math = ?,english = ?,hindi = ? WHERE rollnumber = " + roll;
            System.out.println(cmd);
        } catch (SQLException e) {
            System.out.println(e);
        }
        try {
            ps = con.prepareStatement(cmd);
        } catch (SQLException e) {
            System.out.println(e);
        }
        System.out.println("-- -- -- -- -- -- -- -- -- -- -- --");
//                ps.setInt(1, roll);
        try {

            ps.setInt(1, physics);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("1");
        }
        try {

            ps.setInt(2, chemestry);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("2");
        }
        try {

            ps.setInt(3, math);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("3");
        }
        try {

            ps.setInt(4, english);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("4");
        }
        try {

            ps.setInt(5, hindi);
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("5");
        }
        System.out.println("============");
        try {
            return ps.executeUpdate();

        } catch (Exception e) {
            return 0;
        } finally {
            try {
                System.out.println("++++++++++++++++");
                con.close();
                System.out.println("-------------------*************");

            } catch (SQLException ex) {
                // Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static int ganrateRollNumber(int regi) {

        PreparedStatement ps = null;
        Connection con = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
        }
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");

        } catch (SQLException e) {
        }

        String cmd = "insert into marks(registration_num) values(?)";
        try {

            ps = con.prepareStatement(cmd);

            ps.setInt(1, regi);
        } catch (SQLException e) {

        }

        int i = 0;
        try {
            return ps.executeUpdate();
        } catch (SQLException | NullPointerException e) {
            return -1;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                //Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
